package com.zhangqie.dagger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.zhangqie.dagger.demo1.Demo1Activity;
import com.zhangqie.dagger.demo2.Demo2Activity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text1);
        initView();
    }

    private void initView(){
        findViewById(R.id.btn2).setOnClickListener(this);
        findViewById(R.id.btn3).setOnClickListener(this);
        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btn4).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                startActivity(new Intent(MainActivity.this,Demo1Activity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(MainActivity.this,Main3Activity.class));
                break;
            case R.id.btn4:
                startActivity(new Intent(MainActivity.this,Demo2Activity.class));
                break;
        }
    }
}
