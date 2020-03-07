package com.java.utils;

import java.io.Serializable;

public class DrcsResult implements Serializable {

    private static final long serialVersionUID = -1L;

    private int code = 0;

    private String msg = "成功";

    public DrcsResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public void setCodeAndMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public void setCodeAndMsg(DrcsResult other) {
        this.code = other.code;
        this.msg = other.msg;
    }

    private Object data;

}
