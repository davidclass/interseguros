package com.example.reestructure.models.entity;

import java.util.LinkedList;

public class Salida {

    /**
     * VARIABLES
     **/
    private int code;
    private String title;
    private String message;
    private Object data;

    /**
     * METODOS
     * */
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}




