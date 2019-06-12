package com.example.cyrilfranciscoandroid;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.cyrilfranciscoandroid.utils.ActivityUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.add_game:
                Intent i = new Intent(getApplicationContext(), AddBetActivity.class);
                startActivityForResult(i, ActivityUtils.CODE_ADD_BET);
                return true;
            case R.id.show_game:
                Toast t1 = Toast.makeText(getApplicationContext(), "SHOW ACTION", Toast.LENGTH_SHORT);
                t1.show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case ActivityUtils.CODE_ADD_BET:
                if (resultCode == Activity.RESULT_OK) {
                    showSomething("Add bet activity was a success !");
                    if (data != null) {
                        showSomething(data.getStringExtra(ActivityUtils.TEST_SUCCESS));
                    }
                } else {
                    showSomething("Add bet activity was a failure :(");
                }
        }
    }

    private void showSomething(String text) {
        Toast t = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        t.show();
    }
}
