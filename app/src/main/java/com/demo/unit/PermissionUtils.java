package com.demo.unit;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;

public class PermissionUtils {

    public static boolean isLocationPermissionGranted(Context context) {
        return (context.getApplicationContext().checkCallingPermission(Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) || (context.getApplicationContext().checkCallingPermission(Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED);
    }
}
