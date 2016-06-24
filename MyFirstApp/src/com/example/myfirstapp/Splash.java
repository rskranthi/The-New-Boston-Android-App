package com.example.myfirstapp;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
 
public class Splash extends Activity {
 
    // Splash screen timer
    private static int SPLASH_TIME_OUT = 5000;
    MediaPlayer ourSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        ourSong = MediaPlayer.create(Splash.this,R.raw.cheppinadhe);
        ourSong.start();
        new Handler().postDelayed(new Runnable() {
 
            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */
 
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(Splash.this, MyActivity.class);
                
                startActivity(i);
 
                // close this activity
                ourSong.release();
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
 
}