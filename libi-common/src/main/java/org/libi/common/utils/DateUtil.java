package org.libi.common.utils;


import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by superlee on 2017/11/16.
 * 日期格式化
 */
public final class DateUtil {

    public final static String Format_Year_To_Day = "yyyy-MM-dd";
    public final static String Format_Year_To_Second = "yyyy-MM-dd HH:mm:ss";
    public final static String FORMAT_ONE = "yyyyMMddHHmmss";
    public final static String FORMAT_COMPACT_DAY = "yyyyMMdd";
    public final static String FORMAT_COMPACT_MONTH = "yyyyMM";
    public final static String ZERO_MILLI_SECOND = "000";

    // date类型转换为String类型
    // formatType格式为yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日 HH时mm分ss秒
    // data Date类型的时间
    public static String dateToString(Date data, String formatType) {
        return new SimpleDateFormat(formatType).format(data);
    }

    public static String dateToString(Date date) {
        return new SimpleDateFormat(Format_Year_To_Second).format(date);
    }

    // long类型转换为String类型
    // currentTime要转换的long类型的时间
    // formatType要转换的string类型的时间格式
    public static String longToString(long currentTime, String formatType) {
        Date date = longToDate(currentTime, formatType); // long类型转成Date类型
        String strTime = dateToString(date, formatType); // date类型转成String
        return strTime;
    }

    public static String longToString(long currentTime) {
        Date date = longToDate(currentTime, Format_Year_To_Second); // long类型转成Date类型
        String strTime = dateToString(date, Format_Year_To_Second); // date类型转成String
        return strTime;
    }

    // string类型转换为date类型
    // strTime要转换的string类型的时间，formatType要转换的格式yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日
    // HH时mm分ss秒，
    // strTime的时间格式必须要与formatType的时间格式相同
    public static Date stringToDate(String strTime, String formatType) {
        SimpleDateFormat formatter = new SimpleDateFormat(formatType);
        Date date = null;
        try {
            date = formatter.parse(strTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static Date stringToDate(String strTime) {
        return stringToDate(strTime, Format_Year_To_Second);
    }

    /**
     * 参数允许为null,如果是null则返回null
     *
     * @param strTime
     * @return
     */
    public static Date stringToDateOrNull(String strTime) {
        if (strTime != null) {
            return stringToDate(strTime, Format_Year_To_Second);
        }
        return null;
    }

    /**
     * 参数允许为null,自定义format
     *
     * @param strTime
     * @return
     */
    public static Date stringToDateOrNull(String strTime, String format) {
        if (strTime != null) {
            return stringToDate(strTime, format);
        }
        return null;
    }


    // long转换为Date类型
    // currentTime要转换的long类型的时间
    // formatType要转换的时间格式yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日 HH时mm分ss秒
    public static Date longToDate(long currentTime, String formatType) {
        Date dateOld = new Date(currentTime); // 根据long类型的毫秒数生命一个date类型的时间
        String sDateTime = dateToString(dateOld, formatType); // 把date类型的时间转换为string
        Date date = stringToDate(sDateTime, formatType); // 把String类型转换为Date类型
        return date;
    }

    // string类型转换为long类型
    // strTime要转换的String类型的时间
    // formatType时间格式
    // strTime的时间格式和formatType的时间格式必须相同
    public static long stringToLong(String strTime, String formatType) {
        Date date = stringToDate(strTime, formatType); // String类型转成date类型
        if (date == null) {
            return 0;
        } else {
            long currentTime = dateToLong(date); // date类型转成long类型
            return currentTime;
        }
    }

    // date类型转换为long类型
    // date要转换的date类型的时间
    public static long dateToLong(Date date) {
        return date.getTime();
    }

    /**
     * 根据日期得到年(后两位)
     *
     * @param date 日期
     */
    public static String getYear(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String year = String.valueOf(cal.get(Calendar.YEAR));
        return year.substring(year.length() - 2);
    }

    /**
     * 获取日期的月份（自动补零）
     *
     * @param date 日期
     * @return 返回月数
     */
    public static String getMoth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return String.format("%02d", cal.get(Calendar.MONTH) + 1);
    }

    /**
     * 获取日期的日期（自动补零）
     *
     * @param date 日期
     * @return 返回月数
     */
    public static String getDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return String.format("%02d", cal.get(Calendar.DATE) + 1);
    }

    /**
     * 比较两个时间戳的日期是否相同
     *
     * @param stamp1
     * @param stamp2
     * @return
     */
    public static boolean dateEquals(long stamp1, long stamp2) {
        Date date1 = longToDate(stamp1, Format_Year_To_Second);
        Date date2 = longToDate(stamp2, Format_Year_To_Second);
        return getDate(date1).equals(getDate(date2));
    }

    /**
     * 判断两个时间是否相差指定分钟
     *
     * @param _time1 时间戳1
     * @param _time2 时间戳2
     * @param minute 指定分钟
     * @return 超过指定分钟:false;未超过:true
     */
    public static boolean isTwoTimeDeltaMinute(long _time1, long _time2, int minute) {
        long deltaSecond = Math.abs(_time1 - _time2);
        long deltaMinute = deltaSecond / (1000 * 60);
        int curMinute = new Long(deltaMinute).intValue();
        return curMinute < minute;
    }

    /**
     * 获取最近天数的时间点列表
     *
     * @param day
     * @return
     */
    public static List<Long> getLastDayPoint(int day) {
        List<Long> result = new ArrayList<>();

        long current = System.currentTimeMillis();
        result.add(current);
        // 获取今日凌晨时间戳
        long time = current / (1000 * 3600 * 24) * (1000 * 3600 * 24) - TimeZone.getDefault().getRawOffset();
        result.add(time);
        for (int i = 1; i < day; ++i) {
            time = time - (1000 * 3600 * 24);
            result.add(time);
        }
        Collections.reverse(result);
//        return Lists.reverse(result);
        return result;
    }

    /**
     * 获取最近天数的时间点列表
     *
     * @param start
     * @param end
     * @return
     */
    public static List<Long> getDayPointBetween(Long start, Long end) {
        List<Long> result = new ArrayList<>();

        long current = start;
        result.add(current);
        // 获取今日凌晨时间戳
        long time = current / (1000 * 3600 * 24) * (1000 * 3600 * 24) - TimeZone.getDefault().getRawOffset();
        while (time < end) {
            time = time + (1000 * 3600 * 24);
            result.add(time);
        }
        return result;
    }

    /**
     * 获取今天至今的时间点（每小时）
     *
     * @return
     */
    public static List<Long> getTodayHourPoint() {
        long current = System.currentTimeMillis();
        // 获取今日凌晨时间戳
        long time = current / (1000 * 3600 * 24) * (1000 * 3600 * 24) - TimeZone.getDefault().getRawOffset();
        List<Long> result = new LinkedList<>();
        int num = 24;
        while ((num--) > 0) {
            result.add(time);
            time = time + (1000 * 3600);
        }
        result.add(current);
        return result;
    }

    /**
     * 获取昨日时间点（每小时）
     *
     * @return
     */
    public static List<Long> getYestdayHourPoint() {
        long current = System.currentTimeMillis();
        // 获取今日凌晨时间戳
        long today = current / (1000 * 3600 * 24) * (1000 * 3600 * 24) - TimeZone.getDefault().getRawOffset();
        long yesterday = today - (1000 * 3600 * 24);
        List<Long> result = new LinkedList<>();
        int num = 25;
        while ((num--) > 0) {
            result.add(yesterday);
            yesterday = yesterday + (1000 * 3600);
        }
//        result.add(yesterday - 1000);
//        result.add(yesterday - 1000);
        return result;
    }

    public static Date addHours(final Date date, int hours) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, hours);

        return new Date(cal.getTime().getTime());
    }

    /**
     * 时间增减，按分钟
     *
     * @param date
     * @param minutes
     * @return
     */
    public static Date addMinutes(final Date date, int minutes) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MINUTE, minutes);
        return new Date(cal.getTime().getTime());
    }

    /**
     * 时间增减，按秒
     *
     * @param date
     * @param seconds
     * @return
     */
    public static Date addSeconds(final Date date, int seconds) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.SECOND, seconds);
        return new Date(cal.getTime().getTime());
    }

    /**
     * 获得两个日期之间的秒数 向下取整
     *
     * @param dateStart
     * @param dateEnd
     * @return
     */
    public static int secondsBetweenDatesFloor(Date dateStart, Date dateEnd) {
        long millsBetweenDates = millsBetweenDates(dateStart, dateEnd);
        return (int) (millsBetweenDates / 1000);
    }

    /**
     * 计算两个日期之前的毫秒数
     *
     * @param dateStart
     * @param dateEnd
     * @return
     */
    public static long millsBetweenDates(Date dateStart, Date dateEnd) {
        if (dateStart == null || dateEnd == null) {
            return 0;
        }

        long dateStartTime = dateStart.getTime();
        long dateEndTime = dateEnd.getTime();
        long millsBetweenDates = dateEndTime - dateStartTime;
        millsBetweenDates = millsBetweenDates > 0 ? millsBetweenDates : 0;
        return millsBetweenDates;
    }

    /**
     * 计算两个日期之前的分钟数
     *
     * @param dateStart
     * @param dateEnd
     * @return
     */
    public static int minsBetweenDates(Date dateStart, Date dateEnd) {
        return (int) (millsBetweenDates(dateStart, dateEnd) / 60000);
    }

    public static Date addDays(final Date date, int days) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DAY_OF_MONTH, days);

        return new Date(cal.getTime().getTime());
    }

    public static Date addMonths(final Date date, int months) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH, months);
        return new Date(cal.getTime().getTime());
    }

    public static Date addYears(final Date date, int years) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, years);
        return new Date(cal.getTime().getTime());
    }

    /**
     * 获取实际取证时间点或时间段的字符串
     *
     * @return yyyy-MM-dd HH:mm:ss格式的字符串
     */
    public static String buildForTime(Date startTime, Date endTime) {
        String startTimeFormat = "{0,date,yyyy-MM-dd HH:mm:ss}";
        String allTimeFormat = "{0,date,yyyy-MM-dd HH:mm:ss} ~ {1,date,yyyy-MM-dd HH:mm:ss}";
        if (startTime == null) {
            return "";
        }
        String forTime = MessageFormat.format(startTimeFormat, startTime);
        if (endTime != null) {
            forTime = MessageFormat.format(allTimeFormat, startTime, endTime);
        }

        return forTime;
    }


    /**
     * 获取历史时间获取
     *
     * @return yyyy-MM-dd HH:mm:ss格式的字符串
     */
    public static String buildForTime(Date createTime, Date startTime, Date endTime) {
        if (startTime == null) {
            startTime = createTime;
        }
        return buildForTime(startTime, endTime);
    }

    /**
     * 根据传入的时间向下取证 例如16:25:03.660 -> 16:25:02.000
     *
     * @param time
     * @return
     */
    public static Date buildFloorTime(Date time) {
        String strTime = String.valueOf(time.getTime());
        strTime = strTime.substring(0, 10) + ZERO_MILLI_SECOND;
        return new Date(Long.parseLong(strTime));
    }

    /**
     * 检测某个时间是否处在两个日期之间
     * 时间缺失时，会返回false
     *
     * @return
     */
    public static Boolean isBetweenTwoDay(Date date, Date startTime, Date endTime) {
        if (date == null || startTime == null || endTime == null) {
            return false;
        }
        if (startTime.before(date) && endTime.after(date)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取一天的结尾时间
     * 2022-01-02 12:00:00  -> 2022-01-02 23:59:59
     *
     * @param time
     * @return
     */
    public static Date getOneDayEnd(Date time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 59);
        //防止mysql自动加一秒,毫秒设为0
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }

    /**
     * 获取一天的开始时间
     * 2022-01-02 12:00:00  -> 2022-01-02 00:00:00
     *
     * @param time
     * @return
     */
    public static Date getOneDayStart(Date time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(time);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        //防止mysql自动加一秒,毫秒设为0
        calendar.set(Calendar.MILLISECOND, 0);
        return calendar.getTime();
    }


}
