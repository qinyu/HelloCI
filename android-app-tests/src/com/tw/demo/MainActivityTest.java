package com.tw.demo;

import android.test.ActivityInstrumentationTestCase2;
import android.test.MoreAsserts;
import android.test.ViewAsserts;
import android.view.ViewGroup;
import android.widget.TextView;
import com.jayway.android.robotium.solo.Solo;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.tw.demo.MainActivityTest \
 * com.tw.demo.tests/android.test.InstrumentationTestRunner
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private Solo solo;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    public void testHelloWorldShowed() {
        String text = ((TextView) getActivity().findViewById(R.id.text)).getText().toString();
        assertEquals("Hello world hasn't been shown", "Hello World, MainActivity", text);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        solo.finishOpenedActivities();
    }
}
