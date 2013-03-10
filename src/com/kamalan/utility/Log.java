package com.kamalan.utility;

/**
 * Created with IntelliJ IDEA.
 * User: Hesamedin
 * Date: 3/10/13
 * Time: 12:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class Log {
    static final boolean LOG = true;

    public static void i(String tag, String string) {
        if(LOG)
            android.util.Log.i(tag, string);
    }

    public static void e(String tag, String string) {
        if(LOG)
            android.util.Log.e(tag, string);
    }

    public static void e(String tag, String string, Throwable tr) {
        if(LOG)
            android.util.Log.e(tag, string, tr);
    }

    public static void d(String tag, String string) {
        if(LOG)
            android.util.Log.d(tag, string);
    }

    public static void v(String tag, String string) {
        if(LOG)
            android.util.Log.v(tag, string);
    }

    public static void w(String tag, String string) {
        if(LOG)
            android.util.Log.w(tag, string);
    }
}
