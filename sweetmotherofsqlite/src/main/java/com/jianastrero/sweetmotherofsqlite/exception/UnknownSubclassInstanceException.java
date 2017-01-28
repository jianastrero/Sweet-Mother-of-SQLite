package com.jianastrero.sweetmotherofsqlite.exception;

/**
 * Created by Jian Astrero on 1/10/2017.
 */
public class UnknownSubclassInstanceException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Subclass is unknown, please set the subclass instance of this class by calling setSubclassInstance(this)";
    }
}
