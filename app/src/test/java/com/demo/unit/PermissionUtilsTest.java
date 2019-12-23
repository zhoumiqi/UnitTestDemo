package com.demo.unit;

import android.Manifest;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PermissionUtilsTest {

    @Mock
    Context mContext;

    @Before
    public void setUp() throws Exception {
        System.out.println("PermissionUtils test start……");

    }

    @After
    public void tearDown() throws Exception {
        System.out.println("PermissionUtils test end……");
    }

    @Test
    public void isLocationPermissionGranted() {
        System.out.println("isLocationPermissionGranted testing…… ");
//        Context context = null;
//        try {
//            context = Instrumentation.newApplication(MyApp.class, MyApp.getInstance());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        }
//        assertTrue(PermissionUtils.isLocationPermissionGranted(context));
        Context context = Mockito.mock(Context.class);
        assertNotNull(context);
        Application application = mock(Application.class);
        when(context.getApplicationContext()).thenReturn(application);
        when(application.checkCallingPermission(Manifest.permission.ACCESS_FINE_LOCATION)).thenReturn(PackageManager.PERMISSION_GRANTED);
        when(application.checkCallingPermission(Manifest.permission.ACCESS_COARSE_LOCATION)).thenReturn(PackageManager.PERMISSION_GRANTED);

        Activity activity = Mockito.mock(Activity.class);
        assertNotNull(activity);
        Assert.assertTrue(PermissionUtils.isLocationPermissionGranted(context));
        when(mContext.getString(R.string.app_name)).thenReturn("test1");
        assertEquals("test1", mContext.getString(R.string.app_name));
    }
}