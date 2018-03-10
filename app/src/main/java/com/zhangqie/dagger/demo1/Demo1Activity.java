package com.zhangqie.dagger.demo1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.zhangqie.dagger.R;
import com.zhangqie.dagger.demo1.bean.CommodityInfo;
import com.zhangqie.dagger.demo1.component.DaggerDemo1Component;
import com.zhangqie.dagger.demo1.module.Demo1Module;

import javax.inject.Inject;

/**
 * Created by zhangqie on 2018/3/10.
 *
 *
 * Dagger2的简单使用
 *
 *
 * http://blog.csdn.net/mq2553299/article/details/73065745
 */


public class Demo1Activity extends AppCompatActivity {

    TextView textView;

    @Inject
    CommodityInfo commodityInfo;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo1_layout);
        DaggerDemo1Component.builder().demo1Module(new Demo1Module(this)).build().inject(this);
        initView();
    }


    private void initView(){
        textView = (TextView) findViewById(R.id.textView);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Demo1Activity.this,"对象值："+commodityInfo.toString(),Toast.LENGTH_LONG).show();
                textView.setText("对象值："+commodityInfo.toString());
            }
        });
    }
}
