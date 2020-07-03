package com.lwc.cloud.model.vo;

/**
 * 常用错误码
 */
public enum ResponseStatus {
    SUCCESS(200, null),

    FAIL(500, null),
    /**
     * 参数错误
     * 请通过throw new IllegalArgumentException("xxx")使用此异常
     */
    PARAMETER_ERROR(1000, "业务参数错误"),

    /**
     * 参数检验失败
     * 请通过throw new IllegalArgumentException("xxx")使用此异常
     */
    PARAMETER_VALIDATE(1001, "业务参数校验不通过"),
    /**
     * 位置错误
     */
    UNKNOWN(400, "未知错误"),

    REMOTE_FAIL(600, "远程请求失败"),
    //补充其他错误码
    ;

    int code;
    String message;

    ResponseStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int code() {
        return code;
    }

    public String message() {
        return message;
    }

}
