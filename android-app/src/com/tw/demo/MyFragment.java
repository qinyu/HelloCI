package com.tw.demo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
* Created with IntelliJ IDEA.
* User: twer
* Date: 5/17/13
* Time: 4:39 PM
* To change this template use File | Settings | File Templates.
*/
public class MyFragment extends Fragment {
    // ...
    private TextView textView;
    // ...
    @Override
    public void onSaveInstanceState(Bundle outState) {
        //NPE here if fragment's view is destroyed
        outState.putInt("textIsVisible", textView.getVisibility());
    }
    // ...
}
