package com.java.pd.observer;

/**
 * @Description:
 * @Author: leiline
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void update();
}
