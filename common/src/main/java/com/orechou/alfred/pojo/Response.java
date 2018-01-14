package com.orechou.alfred.pojo;

import com.orechou.alfred.enums.ResponseType;
import lombok.Data;

import java.io.Serializable;

/**
 * 返回的封装类
 *
 * @author OreChou
 * @create 2018-01-12 下午3:54
 */
@Data
public class Response implements Serializable {

    private Integer code;

    private Object content;

    private String message;

    private Response(ResponseType responseType) {
        this.code = responseType.getCode();
        this.message = responseType.getMessage();
    }

    public static Response success(Object content) {
        Response response = new Response(ResponseType.OK);
        response.content = content;
        return response;
    }

    public static Response success(Object content, String message) {
        Response response = new Response(ResponseType.OK);
        response.content = content;
        response.message = message;
        return response;
    }

    public static Response failure(Object content) {
        Response response = new Response(ResponseType.FAIL);
        response.content = content;
        return response;
    }

    public static Response failure(Object content, String message) {
        Response response = new Response(ResponseType.FAIL);
        response.content = content;
        response.message = message;
        return response;
    }

}
