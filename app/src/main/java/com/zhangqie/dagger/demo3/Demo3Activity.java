package com.zhangqie.dagger.demo3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.zhangqie.dagger.R;
import com.zhangqie.dagger.demo1.bean.CommodityInfo;
import com.zhangqie.dagger.demo3.component.DaggerDemo3Component;
import com.zhangqie.dagger.demo3.module.Demo3Module;

import javax.inject.Inject;

/**
 * Created by zhangqie on 2018/3/11.
 *
 * CommodityInfo 关闭   @Inject注解
 *
 *
 */

public class Demo3Activity extends AppCompatActivity {


    TextView textView;

    @Inject
    CommodityInfo commodityInfo;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo1_layout);

       /* DaggerDemo3Component.builder()
                .build().inject(this);*/

        DaggerDemo3Component.builder()
                .demo3Module(new Demo3Module(this))
                .build()
                .inject(this);

        initView();
    }


    private void initView(){
        textView = (TextView) findViewById(R.id.textView);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Demo3Activity.this,"对象值："+commodityInfo.toString(),Toast.LENGTH_LONG).show();
                textView.setText("对象值："+commodityInfo.toString());
            }
        });
    }


}
