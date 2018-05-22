package com.pos.reynaldilatihan;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

/**
 * Created Date: 22/05/2018
 * Author: dhadotid
 */
public class SplitScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.acticity_splitscreen);
        onTimer();
        splashNoBar();
    }

    private void splashNoBar(){
        ActionBar ab = getSupportActionBar();

        if(ab != null){
            ab.hide();
        }
    }

    private void onTimer(){
        Handler hn = new Handler();
        hn.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity( new Intent(SplitScreenActivity.this, LoginActivity.class));
                finish();
            }
        }, 3000);
    }
}
