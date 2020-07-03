package com.lwc.cloud.model.vo;


import lombok.Data;

import java.util.Map;

@Data
public class ResponseVo<T> {
    private boolean success;

    private int code;

    private String message;

    private Map<String, Object> errorDetail;

    private T result;

    public ResponseVo() {
    }

    private ResponseVo(int code, String message, T result) {
        this(code, message, result, null);
    }

    private ResponseVo(int code, String message, T result, Map<String, Object> errorDetail) {
        this.success = ResponseStatus.SUCCESS.code == code;
        this.result = result;
        this.code = code;
        this.message = message;
        this.errorDetail = errorDetail;
    }

    public boolean isSuccess() {
        return success;
    }

    public static ResponseVo<Void> success() {
        return new ResponseVo<Void>(ResponseStatus.SUCCESS.code, null, null);
    }

    public static <T> ResponseVo<T> success(T result) {
        return new ResponseVo<>(ResponseStatus.SUCCESS.code, null, result);
    }

    public static <T> ResponseVo<T> success(String message, T result) {
        return new ResponseVo<>(ResponseStatus.SUCCESS.code, message, result);
    }

    public static ResponseVo fail() {
        return new ResponseVo<Void>(ResponseStatus.FAIL.code, null, null);
    }

    public static <T> ResponseVo<T> fail(String message) {
        return new ResponseVo<T>(ResponseStatus.FAIL.code, message, null);
    }


    public static ResponseVo fail(int code, String message) {
        return new ResponseVo<Void>(code, message, null, null);
    }

    public static <T> ResponseVo<T> fail(String message, T result) {
        return new ResponseVo<>(ResponseStatus.FAIL.code, message, result);
    }

    public static ResponseVo fail(int code, String message, Map<String, Object> errorDetail) {
        return new ResponseVo<Void>(code, message, null, errorDetail);
    }

}
