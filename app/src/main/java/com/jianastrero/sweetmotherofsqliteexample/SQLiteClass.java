package com.jianastrero.sweetmotherofsqliteexample;

import com.jianastrero.sweetmotherofsqlite.SweetSQLite;

/**
 * Created by Jian Astrero on 1/28/2017.
 */
public class SQLiteClass extends SweetSQLite {

    public String string;

    public SQLiteClass() {
        super();

        setSubclassInstance(this);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
