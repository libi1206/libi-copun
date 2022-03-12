package org.libi.common.constant;

/**
 * Created by superlee on 2017/11/6.
 */
public enum Code {
    //通用部分
    UNDEFINED(-1, "未定义"),
    SUCCESS(0, "成功"),
    ERROR(1, "失败"),

    // user start(1000-2000)
    USER_AGREEMENT(1001, "未勾选协议"),
    USER_ACCOUNT_FROZEN(1002, "账户被冻结"),
    USER_PHONE_EXIST(1003, "手机号已注册"),
    USER_BLOCK_UNAUTH(1004, "用户未注册区块链账户"),
    USER_KEY_DOWNLOAD(1005, "用户已下载过密钥"),
    USER_EMAIL_EXIST(1006, "用户已绑定邮箱"),
    USER_USERNAME_EXIST(1007, "用户名已存在"),
    USER_PASSWORD_DIFF(1008, "两次密码不一致"),
    USER_EMAIL_EXIST2(1009, "该邮箱已绑定"),
    USER_UNAUTH(1010, "用户未认证"),
    USER_PHONE_SAME(1011, "该手机号码与原手机号码相同"),
    USER_PHONE_UNEXIST(1012, "手机号码未注册"),
    USER_ACCOUNT_JSON_ERROR(1013, "用户私钥错误"),
    USER_EMAIL_SEND_ERROR(1014, "邮件发送失败"),
    USER_ERROR_PASSWORD_ACCOUNT(1015, "账号或密码错误"),
    USER_PASSWORD_SAME(1016, "新密码不可与原密码一致"),
    USER_ERROR_PASSWORD_OLD(1017, "原密码不正确"),
    USER_PHONE_EMPTY(1018, "手机号不能为空"),
    USER_PASSWORD_EMPTY(1019, "密码不能为空"),
    USER_AUTH_FAIL(1020, "用户认证失败"),
    USER_AUTH_EXAMING(1021, "用户认证正在审核"),
    USER_KEY_CREATE_FAIL(1022, "生成私钥失败"),
    USER_AUTHED(1024, "用户已认证"),
    USER_NOT_EXIST(1025, "用户不存在"),
    USER_FEE_COUNT_ERROR(1026, "计费失败"),
    USER_EMAIL_BIND_FAIL(1029, "邮箱绑定失败"),

    USER_CANCEL_NOT_ALLOW_FAIL(1041, "该用户不在允许删除的列表里"),
    // 用户账户相关（1101至1200）
    USER_ACCOUNT_BALANCE_INSUFFICIENT(1101,"用户余额不足"),
    // 用户账户流水相关（1201至1300）todo
    //E签宝认证（1301至1400）
    USER_ESIGN_ORG_CREATE_NEED_PERSON_AUTH(1301, "E签宝组织创建需要个人认证"),
    USER_ESIGN_TRANSFOR_VERIFY_RANDOM_AMOUNT(1302, "查询不到企业信息不能发起金额验证"),
    USER_ESIGN_VERIFY_RANDOM_AMOUNT_FAIL(1303, "对公打款金额校验错误"),
    USER_ESIGN_AUTH_STATUS_NOTIFY_FAIL(1304, "回调接口错误"),
    USER_NO_ESIGN_ORG(1305, "用户没有组织信息"),
    USER_ESIGN_ORG_CREATE_ORG_STATUS(1306, "组织创建，组织的状态只能是未创建或者未认证"),
    USER_ESIGN_VERIFY_RANDOM_AMOUNT_ORG_STATUS_ERROR(1307, "检验金额企业状态不对"),
    USER_ESIGN_E_AUTH_PICTURE_ERROR(1308, "请求不到实名认证图片"),
    USER_ESIGN_ORG_NAME_EXIST(1309, "该企业已在平台注册"),
    USER_ESIGN_TOKEN_ESIGN_ERROR(1310, "e签宝token获取异常"),
    USER_ESIGN_ESING_NAME_IDNUM_ERROR(1311, "姓名和身份证号不匹配"),
    USER_ESIGN_NOT_AUTH(1312, "用户未认证"),
    //user end


    // contract start(2000-3000)
    CONTRACT_NOAUTH(2002, "未获取权限"),
    CONTRACT_NODATA(2003, "找不到相应数据"),
    CONTRACT_DATA_EXIST(2004, "数据已存在"),
    CONTRACT_IS_NOT_EXIST(2005, "合约不存在"),
    CONTRACT_READ_CONTRACT_ADDRESS_FAIL(2006, "读取合约地址失败"),
    CONTRACT_UPDATE_CONTRACT_FAIL(2007, "更新合约失败"),
    CONTRACT_DEPLOY_CONTRACT_FAIL(2008, "部署合约失败"),
    // contract end(2000-3000)


    // evidence start(3000-3100)
    EVIDENCD_SHARED_UNEXIST(3001, "找不到分享对象"),
    EVIDENCD_NODE_ERROR(3002, "节点验证失败"),
    EVIDENCD_COUNT_FINISH(3003, "当前余额不足，请先进行充值"),
    EVIDENCD_EVI_NOT_EXIST(3004, "未查询到该印刻链唯一编号"),
    //    EVIDENCD_CODE_NOT_FILLED(3005, "存证的提取码未填写"),//未被使用
//    EVIDENCD_CODE_PE(3006, "提取口令格式错误"),//未被使用
    EVIDENCD_CODE_ERROR(3007, "印刻链唯一编号或提取码不正确"),
    EVIDENCD_HASH_NOT_FILLED(3008, "数字存证哈希未填写"),
    EVIDENCD_HASH_PE(3009, "存证哈希格式错误"),
    EVIDENCD_NOTARIZE_EXIST(3010, "该笔存证已申请过公证"),
    EVIDENCE_NOT_EXIST(3011, "存证不存在"),
    EVIDENCE_EVI_NOT_BELONG_THIS_APP(3014, "该笔存证不属于此APP"),
    EVIDENCE_EVI_ON_CHAIN_FAILED(3015, "存证上链失败"),
    EVIDENCE_EVI_NOT_BELONG_TO_THIS_API(3016, "该笔存证不属于当前API版本"),
    EVIDENCE_FILE_HASH_FAILED(3017, "文件哈希计算异常"),
    EVIDENCE_HASH_TYPE_NOT_FOUND(3018, "哈希算法不存在，可用算法为（SHA-1/SHA-256/SHA-512/MD5）"),
    EVIDENCE_AUTH_ERROR(3023, "无权限访问"),
    EVIDENCE_NOTARIZE_EXISIT_DLT_INVALID(3024, "该条证据已申请公证，无法删除！"),
    EVIDENCE_STATUS_DLT_INVALID(3025, "该条证据正在存证，暂时无法删除！"),
    EVIDENCE_FILE_TOO_LONG(3026, "文件名过长，不能超过64字符"),
    EVIDENCE_REMOVE_FAIL(3027, "文件上传失败"),
    EVIDENCE_PRICE_CHANGE(3028, "服务价格发生变化，请确认后重新提交"),
    EVIDENCE_SERVER_PACK_NOT_FIND(3029, "服务包不存在"),
//    QUERY_NOT_EXIST(3024, "未找到与哈希匹配的存取证！"), //未被使用
    //evidence end


    // 公证start 待定
    NOTARIZE_FAILED(3012, "公证失败"),
    NOTARIZE_NOT_EXIST(3013, "该笔存证未申请过公证"),
    NOTARIZE_EVIDENCE_NOT_FIND(3019, "申请公证的证据ID不存在"),
    NOTARIZE_EVIDENCE_TOO_MANY(3020, "申请公证的证据太多了"),
    NOTARIZE_NO_AUTH(3021, "未补充认证的用户不能进行公证"),
    NOTARIZE_EVIDENCE_TOO_LESS(3022, "申请公证需要至少选择一条证据"),
    NOTARIZE_EXIST(3025, "所选证据中包含已经申请过公证的数据，请重新选择"),
    // 公证end


    // forensice start (3101-4000)
    FORENSICS_NOT_EXIST(3101, "找不到相应取证"),
    FORENSICS_FORCOUNT_FINISH(3102, "当前余额不足，请先进行充值"),
    FORENSICS_ID_EMPTY(3103, "取证编号为空"),
    FORENSICS_SHARE_ING(3104, "取证中，暂不可以分享"),
    FORENSICS_SHARE_FAILED(3105, "取证失败，暂不可以分享"),
    FORENSICS_NOTAR_ING(3106, "取证中，暂不可以公证"),
    FORENSICS_NOTAR_FAILED(3107, "取证失败，暂不可以公证"),
    FORENSICS_MUST_HAVE_GPS(3108, "移动端取证必须有GPS信息"),
    FORENSICS_MUST_HAVE_FILE_GPS_UUID(3109, "移动端取证必须有文件、GPS、设备uuid信息"),
    FORENSICS_SUCESSED(3108, "取证已经完成"),
    FORENSICS_FAILED(3109, "取证失败"),
    FORENSICS_STATUS_SWITCH_FAILED(3110, "取证状态更新失败"),
    FORENSICS_IS_NOT_BELONG_YOU(3111, "该条取证不属于你"),
    FORENSICS_PROCESS_NOT_HAVE_DISPATCH_LOG(3112, "过程取证查不到调度日志"),
    FORENSICS_STOP_RECORD_ALREADY_EXECUTE(3113, "停止录屏已经执行过了，请不要重复操作！"),
    FORENSICS_STATUS_DLT_INVALID(3114, "该条证据正在取证，暂时无法删除！"),
    FORENSICS_NOTARIZE_EXISIT_DLT_INVALID(3115, "该条证据已申请公证，无法删除！"),
    FORENSICS_WEB_TASK_BUSY(3116,"当前取证系统繁忙，请稍后再试"),
    //取证推流相关
    FORENSICS_NAME(3116, "取证名称不能为空"),
    FORENSICS_RTMP_ROOMID(3117, "取证推流房间号不能为空"),
    FORENSICS_RTMP_ROOMID_ERROR(3118, "取证推流房间号已存在"),
    FORENSICS_INFO_INVALID(3119, "取证信息有误"),
    FORENSICS_FINISH(3120, "取证余额不足，请充值后再试"),
    FORENSICS_STOP_PROCESS_CHECK_STATUS_ERROR(3121, "停止过程取证状态校验失败"),
    //    //甘道印章相关
//    GANDAO_STAMP_FAIL(3200, "调用甘道查询接口出现异常"),
    //录音相关
    FORENSICS_CALLING_RECORD_FAIL(3300, "通话录音服务器开小差了"),
    FORENSICS_CALLING_NOT_FIND(3301, "通话记录未找到"),
    FORENSICS_CALLING_IS_OVER(3302, "通话已经结束"),
    FORENSICS_MOBILE_ENV_RECORD_NOT_EXIST(3303, "移动端环境检查记录不存在"),
    // 自动取证相关
    FORENSICS_AUTOPLAY_APPLY_HTTP_INVALID(3401, "自动取证中心申请接口响应结果有误"),
    FORENSICS_AUTOPLAY_NOTIFY_STATUS_INVALID(3402, "自动取证回调状态有误"),
    // 公证相关
//    NOTARIZE_EXISIT(3501, "该条证据已申请公证，无法删除！"), //迁移至公证
    // k可信时间戳相关
//    CHINATTAS_TOKEN_ERROR(3601, "可信时间戳接口调用异常"),//迁移至确认函
//    CHINATTAS_INSERT_ERROR(3602, "可信时间插入异常，不存在这个fid"),//迁移至确认函
    FORENSICS_EVI_FOR_COUNT_FINISH(3999, "存取证余额已用完"),
    // forensice end


    //verift code start(4000-5000)
//    VERIFY_CODE_UNEXIST(4001, "验证码不存在"),
    VERIFY_CODE_OVERDUE(4002, "验证码过期"),
    VERIFY_CODE_ERROR(4003, "验证码错误，请重新输入"),
//    KEY_UNEXIST(4004, "口令不存在"),  // 暂未使用
//    KEY_ERROR(4005, "口令错误"),// 暂未使用
//    LINK_ERROR(4006, "链接错误"),// 暂未使用
    //verift code end(4000-5000)


    // blockchain start(5001-6000)
    BLOCKCHAIN_NOT_EXIST(5001, "区块链不存在"),
    BLOCKCHAIN_CONTRACR_NAME_EXIST(5002, "合约标示已存在"),
    BLOCKCHAIN_CONTRACR_NOT_EXIST(5003, "合约不存在"),
    BLOCKCHAIN_EXIST(5004, "该区块链名称已存在"),
    BLOCKCHAIN_HYPERCHAIN_ERROR(5005, "区块链异常"),
    BLOCKCHAIN_INFO_FAILED(5006, "访问区块链信息失败"),
    // blockchain end


    // attachment start(6000-7000)
//    BUCKET_EXIST(6001, "桶已存在"),// 未被使用
//    BUCKET_NOT_EXIST(6002, "桶不存在"),// 未被使用
//    FILE_EXIST(6003, "文件已存在"),// 未被使用
    FILE_NOT_EXIST(6004, "文件不存在"),
    FILE_COMPRESS_FILE(6005, "文件压缩失败"),
    FILE_REMOVE_FAIL(6006, "文件移动失败"),
    FILE_DELETE_FAIL(6007, "文件删除失败"),
//    TYPE_EXIST(6005, "附件类型已存在"),// 未被使用
//    TYPE_NOT_EXIST(6006, "附件类型不存在"),// 未被使用
//    ORGAN_TYPE_NOT_EXIST(6007, "企业与附件类型关联不存在"),// 未被使用
//    PIC_FILE_TOO_LARGE(6008, "图片文件不得超过5M"),// 未被使用


    ATTACH_EVI_FILE_TOO_LARGE(6009, "存证数据不得超过5M"),
    ATTACH_AUD_FILE_TOO_LARGE(6010, "录音文件数据不得超过100M"),
    ATTACH_FILE_TYPE_ERROR(6011, "文件类型不正确"),
    ATTACH_OSS_ERROR(6012, "OSS存储失败"),
    // attachment end


    // app start
    APP_NOT_FOUND(7001, "应用不存在"),
    APP_KEY_NOT_FOUND(7002, "APP KEY不存在"),
    //    APP_TOKEN_NOT_FOUND(7003, "请获取app口令"),//未被使用
    APP_PHONE_VERIFY_FAIL(7004, "手机号信息有误"),
    APP_NAME_EXIST(7005, "该应用名称已存在"),
    APP_ERROR_SECRET_KEY(7006, "secretKey错误"),
    APP_ERROR_APP_STATUS(7007, "应用状态错误"),
    // app end


    // 参数校验 start 8001-9000
    PARAMETER_ERROR(8001, "参数校验异常"),
    ID_CARD_ERROR(8002, "请输入正确的身份证号码"),
    SOCIAL_NUMBER_ERROR(8003, "统一社会信用代码格式错误"),
    PHONE_NUMBER_ERROR(8004, "手机号格式错误"),
    PASSWORD_FORMAT_ERROR(8005, "密码格式错误"),
    EMAIL_FORMAT_ERROR(8006, "邮箱格式错误"),
    USER_NAME_FORMAT_ERROR(8007, "用户名格式错误"),
    NAME_FORMAT_ERROR(8008, "请输入正确的姓名"),
    ORG_NAME_FORMAT_ERROR(8009, "企业名称不能超过50字符，仅能包括中文，数字，字母"),
    ORG_ADDRESS_FORMAT_ERROR(8010, "企业地址不能超过100字符"),
    EVI_CONTEXT_FORMAT_ERROR(8013, "存证内容不能超过1000字符"),
    EMOJI_NOT_ALLOWED(8014, "仅支持输入中文、英文、数字、特殊符号及语言字符"),
    EVIDENCE_NAME_NOT_FORMAT(8015, "存证名称长度为1-20个字符"),
    FORENSIC_NAME_NOT_FORMAT(8016, "取证名称长度为1-20个字符"),
    // 参数校验 end


    // 权限相关 9001-9800
    PERMISSION_DENIED(9001, "您没有相应权限"),
    // 遗留code （9002至9026）参数校验
    UNKNOWN_ABNORMAL(9002, "系统开小差了，请稍后再试"),
    INVALID_USER(9003, "账户不存在"),
    ACCOUNT_KEY_EMPTY(9004, "用户名为空"),
    ACCOUNT_ALREADY_EXIST(9005, "用户名已存在"),
    ERROR_PASSWORD(9006, "密码错误"),
    PASSWORD_ERROR_TIME_OVER(9007, "由于密码输入错误多次，您的账号将被冻结5分钟"),
    ACCOUNT_STILL_LOCK(9008, "该账号已被冻结"),
    TOKEN_FORMAT_ERROR(9009, "token格式错误，不是有效token"),
    TOKEN_INVALID(9010, "登录已过期"),
    TOKEN_CRYPT_ERROR(9011, "token加解密异常"),
    TOKEN_AUTH_ERROR(9012, "您还未认证，请先认证"),
    TOKEN_NOT_FOUND(9013, "未找到token"),
    TOKEN_PERMISSION_ERROR(9014, "token权限有误"),
    NAME_ERROR(9015, "名称不合法"),
    GPSNULL(9016, "无GPS信息"),
    VALID_ERROR(9017, "校验出错"),
    //    LIMIT_FAIL(9018, "系统开小差了，请稍后再试"),
    ACCOUNT_NOT_FOUNT(9019, "用户账户未找到"),
    DATE_SPAN_ERROR(9020, "运营数据跨度不可超过三个月"), //之前写错地了17001修改为9020
    RELEASE_EXIST(9021, "该版本号已发布，不可重复发布"),//之前写错地了17002修改为9021
    APP_SIZE_TOO_LARGE(9022, "上传APP安装包大小不可超过100MB"),//之前写错地了17003修改为9022
    JSON_TRANSFER_ERROR(9023, "JSON转化异常"),
    CLIENT_NOT_REGISTER(9024, "业务系统未注册"),
    CLIENT_ALREADY_REGISTER(9025, "业务系统已注册"),
    CLIENT_ROLE_NOT_EXIST(9026, "该业务系统该角色不存在"),
    // 业务权限相关 9301-9800
    PERMISSION_EVIDENCE_DLT_OP_INVALID(9301, "证据已被删除"),
    // 接口访问权限相关 9800至10000
    LIMIT_FAIL(9994, "系统开小差了，请稍后再试"), // 9018修改为9994
    GANDAO_STAMP_FAIL(9995, "调用甘道查询接口出现异常"),
    SECURITY_PICTURE_INVALID(9996, "图片未通过安全校验"),
    SECURITY_CONTENT_INVALID(9997, "内容未通过安全校验"),
    REQUEST_TOO_OFTEN_RETRY(9998, "请求过于频繁，请稍后重试"),
    SYSTEM_ERROR(9999, "系统开小差了，请稍后重试"),
    // 9000-10000 权限校验（之前遗留） end


    // order start （11001-12000）
    ORDER_CODE_GEN_FAILDED(11001, "生成提取码失败"),
    ORDER_NOT_FOUND(11002, "订单不存在"),
    PRE_ORDER_FAILDED(11003, "下单失败"),
    PACKAGE_CODE_INVALID(11004, "提取码不存在"),
    PACKAGE_CODE_IS_LOCK(11005, "该提取码未完成支付，请完成支付！"),
    ORDER_NOTIFY_PARAMETER_ERROR(11006, "订单的回调信息数据有误"),
    ORDER_STATUS(11007, "订单状态有误"),
    ORDER_CREATE_PARAMS_ERROR(11008, "创建订单参数错误"),
    ORDER_BUY_GOODS_NOT_EXIST(11009, "购买内容不存在"),
    ORDER_PAY_METHOD_PARAM_ERROR(11010, "支付方式参数错误"),
    // order end


    // VB start（12001-13000）
    VB_BUSY(12001, "虚拟机繁忙，暂无可用虚拟机"),
    VB_NOT_EXIST(12002, "虚拟机不存在"),
    VB_PROCESS_ERROR(12003, "过程取证错误，请稍后重试"),
    // VB end


    // 网络监管系统对接 start（13001 -14000）
    HOOKCHECK_REQUEST_ERROR(13001, "请求失败"),
    HOOKCHECK_REQUEST_BIZ_ERROR(13002, "请求业务失败"),
    HOOKCHECK_THIS_EVIDENCE_HAS_BEEN_BANNED(13003, "该证据内容违反安全相关规定，内容不可查看"),
    HOOKCHECK_THIS_EVIDENCE_HAS_BEEN_BANNED_FOR_WEB_DETAIL(13004, "该证据内容违反安全相关规定，内容不可查看"),
    // 网络监管系统对接 end

    // 确认函start 14001-15000？
    PDF_ERROR(14001, "确认函错误"),
    PDF_MODEL_ERROR(14002, "确认函模板不匹配"),
    PDF_SHARE_NOT_ALLOWED(14003, "共享存证无权限生成数据保全证书"),
    PDF_MODEL_NOT_FIND(14004, "没有这个确认函模板"),
    PDF_COURT_NOT_FIND(14005, "这个存证找不到杭互法信息"),
    PDF_ORD_HAVE_NO_DATA_PRESERVATION(14006, "普通存证不能申请数据保全确认函"),
    PDF_DATA_NO_AUTH(14007, "此证据不可申请数据保全证书"),
    WORD_EVIDENCE_HAVE_TO_BE_EVIDENCE(14008, "作品存证证书只能存证进行申请"),
    PDF_NOT_FIND(14009, "确认函没有找到"),
    PDF_IMG_GEN_ERROR(14910, "确认函预览图生成异常"),
    // 确认函end

    // k可信时间戳相关
    CHINATTAS_TOKEN_ERROR(3601, "可信时间戳接口调用异常"),
    CHINATTAS_INSERT_ERROR(3602, "可信时间插入异常，不存在这个fid"),

    // 支付 start（15001-16000）
    PAY_ORDER_FAILED(15001, "创建订单失败"),
    APP_INITIATE_THIRD_PARTY_PAY_FAILED(15002, "app发起第三方支付失败"),
    PAY_RECORD_NOT_EXIST(15003, "支付记录不存在"),
    PAY_NOTIFY_AMOUNT_NOT_MATCH(15004, "支付回调金额不匹配"),
    PAY_NOTIFY_PAYNO_NOT_MATCH(15005, "支付回调单号不匹配"),
    PAY_IS_SUCCESSED_NOT_NEED_NOTIFY(15006, "支付已经成功无需回调"),
    // 支付 end


    //开放取证（16001-17000）
    OPEN_F_PHOTO_ID_ERROR(16001, "照片id不正确"),
    OPEN_F_WEB_ERROR(16002, "网页取证失败"),
    OPEN_F_WEB_TARGETURL_NOT_CONNECT_ERROR(16003, "网页取证目标地址无法联通"),
    //开放取证 end


    //运用配置（18001-19000）
    OPERATION_CONF_NOT_EXIST(18001, "运营配置找不到"),
    //运用配置 end


    //侵权监测（19001-20000）
    MONITOR_NOT_FIND(19001, "监测记录未找到"),
    MONITOR_IS_RUNNING(19002, "监测正在运行"),
    MONITOR_IS_NOT_RUNNING(19003, "监测没有在运行"),
    MONITOR_INSERT_META_ERROR(19004, "插入母本异常"),
    MONITOR_FILE_HAS_EXIST(19005, "监测文件已经存在"),
    MONITOR_FUNCTION_DISABLED(19006, "监测服务目前仅对受邀用户开放，您可通过示例查看服务效果。\n如需试用，欢迎咨询：0571-89990095。"),
//    URL_HAS_EXIST(19006, "监测地址已经存在");// 未被使用
    //侵权监测 end

    //短信名称（20001-21000）
    SMS_TEMPLATE_CHOOSE_ERROR(20001, "短信模板错误，请重新选择"),
    SMS_MESSAGE_SEND_ERROR(20002, "短信发送异常"),

    // 退款异常检测（21001-22000）
    REFUND_EVIDENCE_ERROR(21001,"目前尚有存/取证服务未完成，暂不可申请退款"),
    REFUND_AFTER_EXPIRATION_TIME_ERROR(21002,"当前订单已超过退款日期，不可申请退款"),
    REFUND_BEFORE_START_TIME_ERROR(21003,"畅享无忧套餐购买满30天后才能申请退款"),
    REFUND_ZERO_COIN_ERROR(21004,"当前套餐内剩余印币数为0，不可申请退款"),
    REFUND_REFUNDED_ERROR(21005,"当前套餐退款中或已退款，不可重复申请退款"),
    REFUND_NOT_FOUND_ORDER(21006,"未找到此订单的相关信息，请重新申请退款"),

    // 小程序相关
    WE_CHAT_API_ERROR(22001, "微信接口调用错误"),


    // 文档管理功能（22001-23000）
    DOCUMENT_ID_EMPTY(22001,"文档id不能为空"),
    DOCUMENT_DETAILS_NO_EXIST(22002,"文档详情为空"),

    // 公证模块（23001-24000）
    NOTAR_HH_API_INVALID(23001,"杭互服务异常")
    ;
    private int code;
    private String msg;

    // 构造方法
    Code(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public int getCode() {
        return code;
    }

    public static String getMsgByCodeInt(int codeInt) {
        for (Code e : Code.values()) {
            if (e.getCode() == codeInt) {
                return e.msg;
            }
        }
        throw new IllegalArgumentException("未定义的code码:" + codeInt);
    }

    public static Code getCodeByCodeInt(int codeInt) {
        for (Code code : Code.values()) {
            if (code.getCode() == codeInt) {
                return code;
            }
        }
        throw new IllegalArgumentException("未定义的code码:" + codeInt);
    }

}
