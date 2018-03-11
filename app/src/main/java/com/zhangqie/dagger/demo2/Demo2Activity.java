package com.zhangqie.dagger.demo2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.zhangqie.dagger.R;
import com.zhangqie.dagger.demo2.bean.DemoInfo;
import com.zhangqie.dagger.demo2.component.DaggerDemo2Component;

import javax.inject.Inject;

/**
 * Created by zhangqie on 2018/3/10.
 */

public class Demo2Activity extends AppCompatActivity {


    TextView textView;

    @Inject
    DemoInfo demoInfo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo1_layout);
        initView();
    }

    private void initView(){
        //使用组件进行构造，注入
        DaggerDemo2Component.builder().build().inject(this);
        textView = (TextView) findViewById(R.id.textView);
        demoInfo.setUerNikeName("我是小章");
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Toast.makeText(Demo2Activity.this,"对象值："+demoInfo.getUerNikeName(),Toast.LENGTH_LONG).show();
                    textView.setText("对象值："+demoInfo.getUerNikeName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
