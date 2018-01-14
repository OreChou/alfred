package com.orechou.alfred.enums;

/**
 * Response的类型
 *
 * @author OreChou
 * @create 2018-01-12 下午3:56
 */
public enum ResponseType {

    OK(200, "请求成功"),
    BAD_REQUEST(400, "400 Bad Request"),
    FAIL(404, "请求失败");

    private Integer code;

    private String message;

    ResponseType(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

}
