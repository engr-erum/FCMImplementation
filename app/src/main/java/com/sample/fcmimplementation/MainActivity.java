package com.sample.fcmimplementation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //no need to write any code here  to get token.On application install it will check for internet permission if internet connects it will automatically
        //fetch DeviceToken.

    }
}
