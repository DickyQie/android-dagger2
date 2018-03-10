package com.zhangqie.dagger.demo2.component;

import com.zhangqie.dagger.demo2.Demo2Activity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Administrator on 2018/3/10.
 */


@Singleton
@Component()
public interface Demo2Component {

    void inject(Demo2Activity demo2Activity);

}
