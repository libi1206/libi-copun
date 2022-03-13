package org.libi.common.utils;

import com.alibaba.fastjson.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author wanghaifeng
 * @description 字符串工具类
 * @date 2020/2/13
 */
public class StringUtil {
    /**
     * 省份证隐藏
     *
     * @param idNum
     * @return
     */
    public static String idNumHide(String idNum) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < idNum.length(); i++) {
            if (i < 4 || i > idNum.length() - 3) {
                stringBuilder.append(idNum.charAt(i));
            } else {
                stringBuilder.append("*");
            }
        }
        return stringBuilder.toString();
    }

    /**
     * 名字隐藏
     *
     * @param name
     * @return
     */
    public static String nameHide(String name) {
        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            if (i == 1) {
                nameBuilder.append('*');
            } else {
                nameBuilder.append(name.charAt(i));
            }
        }
        return nameBuilder.toString();
    }

    /**
     * 手机隐藏
     *
     * @param phone
     * @return
     */
    public static String phoneHide(String phone) {
        StringBuilder nameBuilder = new StringBuilder();
        for (int i = 0; i < phone.length(); i++) {
            if (i > 2 & i < 7) {
                nameBuilder.append('*');
            } else {
                nameBuilder.append(phone.charAt(i));
            }
        }
        return nameBuilder.toString();
    }


    public static String longUrlRender(String url) {
        int frontSize = 50;
        int behindSize = 18;
        return longUrlRender(url, frontSize, behindSize);
    }

    public static String longUrlRender(String url, int frontSize, int behindSize) {
        if (url.length() > (frontSize + behindSize + 6)) {
            StringBuffer sb = new StringBuffer();
            sb.append(url.substring(0, frontSize))
                    .append("......")
                    .append(url.substring(url.length() - behindSize));
            return sb.toString();
        } else {
            return url;
        }
    }

    /**
     * 生成订单编号
     * 年份+月+日+用户手机后四位+小时+分钟+秒+3位随机数（共21位）
     *
     * @param phoneNum
     * @return
     */
    public static String orderNo(String phoneNum) {
        StringBuffer dateStrBuffer = new StringBuffer(DateUtil.dateToString(new Date(), DateUtil.FORMAT_ONE));
        dateStrBuffer.insert(8, phoneNumSuffix(phoneNum)).append(randomNum(3));
        return dateStrBuffer.toString();
    }

    /**
     * 生成支付编号
     * 年份+月+日+用户手机后四位+小时+分钟+秒+6位随机数（共22位）
     *
     * @param phoneNum
     * @return
     */
    public static String orderPayNo(String phoneNum) {
        StringBuffer dateStrBuffer = new StringBuffer("p");
        dateStrBuffer.append(DateUtil.dateToString(new Date(), DateUtil.FORMAT_ONE));
        dateStrBuffer.insert(9, phoneNumSuffix(phoneNum)).append(randomNum(6));
        return dateStrBuffer.toString();
    }

    /**
     * 生成退款编号
     * 年份+月+日+用户手机后四位+小时+分钟+秒+6位随机数（共22位）
     *
     * @param phoneNum
     * @return
     */
    public static String refundNo(String phoneNum) {
        StringBuffer dateStrBuffer = new StringBuffer("r");
        dateStrBuffer.append(DateUtil.dateToString(new Date(), DateUtil.FORMAT_ONE));
        dateStrBuffer.insert(9, phoneNumSuffix(phoneNum)).append(randomNum(6));
        return dateStrBuffer.toString();
    }

    /**
     * 账户流水后缀
     * 年份+月+日+小时+分钟+秒+用户手机号后4位+3位随机数
     *
     * @param phoneNum
     * @return
     */
    public static String accountLogNoSuffix(String phoneNum) {
        StringBuffer dateStrBuffer = new StringBuffer(DateUtil.dateToString(new Date(), DateUtil.FORMAT_ONE));
        dateStrBuffer.append(phoneNumSuffix(phoneNum)).append(randomNum(3));
        return dateStrBuffer.toString();
    }


    /**
     * 生成开票编号
     * 年份+月+日+用户手机后四位+小时+分钟+秒+3位随机数（共21位）
     *
     * @param phoneNum
     * @return
     */
    public static String InvoiceNo(String phoneNum) {
        StringBuffer dateStrBuffer = new StringBuffer(DateUtil.dateToString(new Date(), DateUtil.FORMAT_ONE));
        dateStrBuffer.insert(8, phoneNumSuffix(phoneNum)).append(randomNum(3));
        return dateStrBuffer.toString();
    }


    /**
     * 指定获得几位随机数（不能保证绝对不重复）
     *
     * @param digitNum
     * @return
     */
    public static int randomNum(int digitNum) {
        if (digitNum == 1) {
            return (int) (Math.random() * 10);
        } else {
            return (int) (Math.random() * 9 * Math.pow(10, digitNum - 1) + Math.pow(10, digitNum - 1));
        }
    }

    /**
     * 手机号后缀
     *
     * @param phoneNum
     * @return
     */
    public static String phoneNumSuffix(String phoneNum) {
        return phoneNum.substring(7, 11);
    }

    /**
     * 根据格式获取时间戳
     *
     * @param time
     * @param pattern
     * @return
     */
    public static Long getTimestampByString(String time, String pattern) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.parse(time).getTime();
    }

    /**
     * 根据时间戳获取格式化的时间字符串
     *
     * @param timestamp
     * @param pattern
     * @return
     */
    public static String getTimeString(long timestamp, String pattern) {
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        return format.format(new Date(timestamp));
    }

    /**
     * 检查JSON中是否含有指定的Key
     *
     * @param eviContextJson
     * @param keys
     * @return 检查是否通过
     */
    public static boolean checkParam(JSONObject eviContextJson, String... keys) {
        for (String key : keys) {
            if (!eviContextJson.containsKey(key)) {
                return false;
            }
        }
        return true;
    }


    /**
     * 生成支付编号
     * 年份+月+日+小时+分钟+秒+6位随机数（共20位）
     *
     * @param
     * @return
     */
    public static String orderPayNo() {
        StringBuffer dateStrBuffer = new StringBuffer(DateUtil.dateToString(new Date(), DateUtil.FORMAT_ONE));
        dateStrBuffer.append(randomNum(6));
        return dateStrBuffer.toString();
    }


    /*
     * 生成兑换码 需要业务代码里面保证唯一
     *
     * @return
     */
    public static String exchangeCode() {
        char[] arr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57,//从0到9的数字
                65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90,//从A到Z的数字
        };
        int i = 1;
        Random r = new Random();
        StringBuffer string = new StringBuffer();
        while (i++ <= 5) {
            char msg = arr[r.nextInt(arr.length)];
            String str = String.valueOf(msg);
            string.append(str);
        }
        return string.toString();
    }


    /**
     * 获取字符串的字符长度
     *
     * @param s
     * @return
     */
    public static int getWordCount(String s) {
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            int ascii = Character.codePointAt(s, i);
            if (ascii >= 0 && ascii <= 255) {
                length++;
            } else {
                length += 2;
            }
        }
        return length;
    }

    /**
     * 新传入的版本号是否大于或等于老的版本号
     *
     * @param oldVersion 老的版本号
     * @param newVersion 新传入的版本号
     * @return
     */
    public static Boolean isHigherOrEqualVersion(String newVersion, String oldVersion) {
        String[] newSplit = newVersion.split("\\.");
        String[] oldSplit = oldVersion.split("\\.");
        for (int i = 0; i < oldSplit.length; i++) {
            // 最后一列版本号
            if (i == oldSplit.length - 1) {
                if (Integer.parseInt(newSplit[i]) >= Integer.parseInt(oldSplit[i])) {
                    return true;
                }
            } else {
                if (Integer.parseInt(newSplit[i]) > Integer.parseInt(oldSplit[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 生成随机字符串，指定位数
     *
     * @param bit
     * @return
     */
    public static String generateRandomStr(int bit) {
        if (bit <= 0) {
            bit = 1;
        }

        char[] arr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57,//从0到9的数字
                65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90,//从A到Z的数字
                97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122,//从a到z的数字
        };

        Random r = new Random();
        StringBuffer string = new StringBuffer();
        for (int i = 0; i < bit; i++) {
            char msg = arr[r.nextInt(arr.length)];
            String str = String.valueOf(msg);
            string.append(str);
        }

        return string.toString();
    }

    /**
     * 生成默认密码
     *
     * @return
     */
    public static String generateDefaultPassword() {
        return StringUtil.generateRandomStr(8) + "0x";
    }
}
