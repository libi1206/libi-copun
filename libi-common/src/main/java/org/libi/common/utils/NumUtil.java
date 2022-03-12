package org.libi.common.utils;


import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.UUID;

/**
 * 编号生成util
 *
 * @author gcg
 **/
public final class NumUtil {

    private NumUtil(){}

    /**
     * 生成存证编号
     *
     * @param mark      存证业务类型
     * @param timestamp 13位时间戳
     * @param extra     自定义值，默认为0000
     * @param pubKey    调用者公钥
     * @return 32位定长编号
     */
    public static final String createEviNum(String mark, long timestamp, String extra, String pubKey) {
        StringBuffer stringBuffer = new StringBuffer(32);

        // 数据检查
        mark =  StringUtils.rightPad(mark, 4,'0').substring(0,4);
        extra = StringUtils.rightPad(extra, 4,'0').substring(0,4);

        // 13位时间戳构建8位可读性日期
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String dateStr = simpleDateFormat.format(timestamp);


        // 构建16位md5值
        StringBuffer md5StrBuf = new StringBuffer();
        String uuid = UUID.randomUUID().toString();
        md5StrBuf.append(mark).append(timestamp).append(extra).append(uuid).append(pubKey);

        String md532 = DigestUtils.md5Hex(md5StrBuf.toString());
        String md516 = md532.substring(8, 24);

        stringBuffer.append(dateStr);
        stringBuffer.append(extra);
        stringBuffer.append(mark);
        stringBuffer.append(md516);

        // 构建16位md5值
        return stringBuffer.toString();
    }

}
