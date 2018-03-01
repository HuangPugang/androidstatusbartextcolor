package com.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    boolean isdark = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Utils.setDarkStatusBarText(this,isdark,R.color.colorAccent);

        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                isdark = !isdark;
                if (isdark){
                    Utils.setDarkStatusBarText(MainActivity.this,isdark,R.color.colorAccent);
                }else {
                    Utils.setDarkStatusBarText(MainActivity.this,isdark,R.color.main_color);
                }
            }
        });
    }
}
