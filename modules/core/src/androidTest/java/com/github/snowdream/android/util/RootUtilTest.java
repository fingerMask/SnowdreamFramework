package com.github.snowdream.android.util;

import android.test.AndroidTestCase;

/**
 * Created by snowdream on 4/8/14.
 */
public class RootUtilTest extends AndroidTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testRootCheck() {
        boolean isRoot = RootUtil.isDeviceRooted();
        assertTrue(isRoot);
    }
}
