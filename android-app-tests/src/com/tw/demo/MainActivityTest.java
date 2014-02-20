package com.tw.demo;

import android.annotation.SuppressLint;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

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
@SuppressLint("NewApi")
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super("com.tw.demo", MainActivity.class);
    }

    public void testShowSpinnerButton() {
        String text = ((TextView) getActivity().findViewById(R.id.spinner_btn)).getText().toString();
        assertEquals("Should show spinner button", "Spinner", text);
    }

    public void testShowInputViewButton() {
        String text = ((TextView) getActivity().findViewById(R.id.input_view_btn)).getText().toString();
        assertEquals("Should show input view button", "Input View", text);
    }

}
