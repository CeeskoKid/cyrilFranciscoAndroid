package com.example.cyrilfranciscoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.cyrilfranciscoandroid.utils.ActivityUtils;

public class activity_add_game extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_game);
        setData();
    }

    private void setData() {
//        Button successButton = findViewById(R.id.success_button);
//        Button failureButton = findViewById(R.id.failure_button);
//        successButton.setOnClickListener(view -> finishActivityWithSuccess());
//        failureButton.setOnClickListener(view -> finishActivityWithFailure());
    }

    private void finishActivityWithSuccess() {
        Intent i = getIntent();
        i.putExtra(ActivityUtils.TEST_SUCCESS, "Success");
        setResult(Activity.RESULT_OK, i);
        finish();
    }

    private void finishActivityWithFailure() {
        setResult(Activity.RESULT_CANCELED);
        finish();
    }
}
