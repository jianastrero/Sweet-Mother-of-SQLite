package com.jianastrero.sweetmotherofsqlite.exception;

/**
 * Created by Jian Astrero on 1/28/2017.
 */
public class SweetSQLiteSuperNotCalledException extends RuntimeException {
    @Override
    public String getMessage() {
        return "SweetSQLite subclasses should call super()! please call super() on this subclass";
    }
}
