package com.zhangqie.dagger.demo1.module;


import com.zhangqie.dagger.demo1.Demo1Activity;

import dagger.Module;

/**
 * Created by zhangqie on 2018/3/10.
 */


@Module  //意这是一个提供数据的【模块】
public class Demo1Module {

    private Demo1Activity demo1Activity;

    public Demo1Module (Demo1Activity activity){
        this.demo1Activity = activity;
    }

}
