package com.zhangqie.dagger.demo1.component;

import com.zhangqie.dagger.demo1.Demo1Activity;
import com.zhangqie.dagger.demo1.module.Demo1Module;

import dagger.Component;

/**
 * Created by zhangqie on 2018/3/10.
 */


//这是一个【组件】/注射器
@Component(modules = Demo1Module.class)
public interface Demo1Component {

    //这个连接器要注入的对象。这个inject标注的意思是，我后面的参数对象里面有标注为@Inject的属性，这个标注的属性是需要这个连接器注入进来的。
    void inject(Demo1Activity demo1Activity);


}
