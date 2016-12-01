package com.rensisi.ariz.ariz.util;

import android.content.Context;

/**
 * Created by THINK on 2016/12/1.
 */
public class MyAppContext {

    private  Context context;

    private static MyAppContext ourInstance = new MyAppContext();

    public static MyAppContext getInstance() {
        return ourInstance;
    }

    private MyAppContext() {

    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }




}
