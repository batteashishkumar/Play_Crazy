package com.example.play_crazy;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
//    TextView toss_view;
    String toss_res="HEADS";
    ImageView coinimg;
    private int run = 0;
    String number_overs;
    Spinner overs_spin;
    private Handler handler=new Handler();
    private Runnable runnable=new Runnable() {
        @Override
        public void run() {
            xMethod();

            if (toss_res== "HEADS") {

                coinimg.setImageDrawable(getResources().getDrawable(R.drawable.coin2));
                toss_res="TAILS";
            }
            else {
                if (toss_res == "TAILS") {

                    coinimg.setImageDrawable(getResources().getDrawable(R.drawable.coin1));
                    toss_res = "HEADS";
                }
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        toss_view = findViewById(R.id.toss_text);
        coinimg=findViewById(R.id.coinimg);
        overs_spin =findViewById(R.id.over_spin);
    }


    public void Toss(View v){
        xMethod();
        Toast.makeText(getApplicationContext(),"finished",Toast.LENGTH_SHORT).show();

    }

    public void startmatch(View v){
        number_overs = overs_spin.getSelectedItem().toString();
        Intent i=new Intent(this,Main2Activity.class);
        i.putExtra("number_overs",number_overs);
        startActivity(i);
    }


    private void xMethod(){
        int random = new Random().nextInt((30 - 20) + 1) + 20;


        handler.postDelayed(runnable, 150);
        if (run >= random) {
           handler.removeCallbacks(runnable);
            Log.e("xMethod","handler canceled");
        }
        run++;
        Log.e("xMethod","X Method runs");
    }
//    public void showDialog(MainActivity activity, String title, CharSequence message) {
//        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
//
//        if (title != null) builder.setTitle(title);
//
//        builder.setMessage(message);
//        builder.setPositiveButton("OK", null);
//        builder.setNegativeButton("Cancel", null);
//        builder.show();
//    }


}



