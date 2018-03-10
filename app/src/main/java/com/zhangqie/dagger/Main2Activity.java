package com.zhangqie.dagger;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.zhangqie.dagger.component.DaggerMainComponent;
import com.zhangqie.dagger.component.MainComponent;
import com.zhangqie.dagger.module.MainModule;
import com.zhangqie.dagger.moger.Cloth;
import com.zhangqie.dagger.moger.Clothes;
import com.zhangqie.dagger.moger.Shoe;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by Administrator on 2018/3/10.
 *
 * https://www.jianshu.com/p/1d84ba23f4d2
 *
 * https://www.cnblogs.com/all88/p/5788556.html
 *
 * http://blog.csdn.net/fan_zyf/article/details/71720592#t6
 *
 * https://wenku.baidu.com/view/35e1f5effc4ffe473268ab7f.html
 *
 * https://github.com/luxiaoming/dagger2Demo
 *
 * https://www.jianshu.com/p/708a3e957cf8
 *
 *
 * https://www.jianshu.com/p/37b05878119c
 *
 * https://www.jianshu.com/p/24af4c102f62
 * https://www.jianshu.com/p/01d3c014b0b1
 *
 * https://www.jianshu.com/p/a23c50cb4094
 *
 *
 */

public class Main2Activity extends AppCompatActivity {

    TextView textView;
    @Inject
    Cloth cloth;
    @Inject
    Shoe shoe;
    @Inject
    Clothes clothes;



    @Inject
    @Named("red")
    Cloth redCloth;
    @Inject
    @Named("blue")
    Cloth blueCloth;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.module_layout);
        initView();
    }


    private void initView (){
        textView = (TextView) findViewById(R.id.textContent);
        showDagger2();
    }


    private void showDagger2(){
        MainComponent mainComponent = DaggerMainComponent.builder().mainModule(new MainModule()).build();
        mainComponent.inject(this);
        textView.setText("颜色："+cloth+"---"+shoe+"---"+clothes+"---"+redCloth+"---n");
    }

}
