package com.zhangqie.dagger.component;

import com.zhangqie.dagger.Main2Activity;
import com.zhangqie.dagger.Main3Activity;
import com.zhangqie.dagger.module.MainModule;

import dagger.Component;

/**
 * Created by Administrator on 2018/3/10.
 */


@Component(modules = MainModule.class)
public interface MainComponent {

    //这个连接器要注入的对象。这个inject标注的意思是，我后面的参数对象里面有标注为@Inject的属性，这个标注的属性是需要这个连接器注入进来的。
    void inject(Main2Activity main2Activity);

    void inject(Main3Activity main3Activity);


}
