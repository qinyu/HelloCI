package com.tw.demo.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.tw.demo.R;

public class EditTextActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_text);
    }

    public void clear(View view) {
        EditText editText = (EditText) findViewById(R.id.content_edit_text);
        editText.setText("");
    }
}
