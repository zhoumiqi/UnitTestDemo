package com.demo.unit;

import android.app.Instrumentation;
import android.content.Context;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
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
        assertTrue(PermissionUtils.isLocationPermissionGranted(mContext));
        when(mContext.getString(R.string.app_name)).thenReturn("test1");
        assertEquals("test", mContext.getString(R.string.app_name));
    }
}