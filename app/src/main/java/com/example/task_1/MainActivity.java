package com.example.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton shopee = (ImageButton)findViewById(R.id.shopee);
        ImageButton tokopedia = (ImageButton)findViewById(R.id.Tokopedia);
        ImageButton bukalapak = (ImageButton)findViewById(R.id.BukaLapak);
        ImageButton jdid = (ImageButton)findViewById(R.id.jdid);
        shopee.setOnClickListener(this);
        tokopedia.setOnClickListener(this);
        bukalapak.setOnClickListener(this);
        jdid.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.shopee :
                openShopeeHistory();
                break;
            case R.id.Tokopedia :
                openTokopediaHistory();
                break;
            case R.id.BukaLapak :
                openBukalapakHistory();
                break;
            case R.id.jdid :
                openJDIDHistory();
                break;


        }
    }
    public void openShopeeHistory(){
        Intent shopeeHistory = new Intent(this, ShopeeHistory.class);
        startActivity(shopeeHistory);
    }

    public void openTokopediaHistory(){
        Intent tokopediaHistory = new Intent(this, TokopediaHistory.class);
        startActivity(tokopediaHistory);
    }

    public void openBukalapakHistory(){
        Intent bukalapakHistory = new Intent(this, BukalapakHistory.class);
        startActivity(bukalapakHistory);
    }
    public void openJDIDHistory(){
        Intent jdidHistory = new Intent(this, JdIdHistory.class);
        startActivity(jdidHistory);
    }
}
