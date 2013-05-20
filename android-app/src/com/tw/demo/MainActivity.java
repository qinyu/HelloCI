package com.tw.demo;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;

public class MainActivity extends Activity {

    private AsyncTask<Void, Void, Boolean> asyncTask;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        if (getLastNonConfigurationInstance() != null) {
            asyncTask = (AsyncTask<Void, Void, Boolean>) getLastNonConfigurationInstance();
            // check the
        } else {
            asyncTask = new AsyncTask<Void, Void, Boolean>() {
                @Override
                protected Boolean doInBackground(Void... params) {
                    return null;
                }
            };
            asyncTask.execute();
        }
    }

    @Override
    public Object onRetainNonConfigurationInstance() {
        return asyncTask;
    }
}
