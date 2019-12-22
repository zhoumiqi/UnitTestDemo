package com.demo.unit;

import android.app.Activity;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class Utils {

    public static int add(int a, int b) {
        return a + b;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public static boolean isUIAlive(Activity activity){
        if(activity == null){
            return false;
        }
        return !activity.isFinishing() && !activity.isDestroyed();
    }

}
