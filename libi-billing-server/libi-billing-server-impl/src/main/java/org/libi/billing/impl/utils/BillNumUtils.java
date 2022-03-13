package org.libi.billing.impl.utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.libi.common.utils.StringUtil;

/**
 * @author :Libi
 * @version :1.0
 * @date :8/3/21 4:06 PM
 */
public class BillNumUtils {

    /**
     * 生成流水编号
     * @return
     */
    public static String createBillId() {
        String timeString = StringUtil.getTimeString(System.currentTimeMillis(), "yyyyMMddHHmmss");
        String randomString = RandomStringUtils.random(6, false, true);
        return timeString + randomString;
    }


    public static String getConsumeNum(long minutes) {
        return minutes + " 分钟";
    }

    public static String getQuantityNum(long quantity) {
        return quantity + " 次";
    }
}
