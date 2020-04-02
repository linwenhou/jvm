package com.venvo.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

/**
 * @author venvo
 * @date 2020-04-02 11:07
 * @description 串行垃圾收集器
 * @modified By
 * @version: jdk1.8
 * <p>
 * 串行垃圾收集器，是指使用单线程进行垃圾回收，垃圾回收时，只有一个线程在工作， 并且java应用中的所有线程都要暂停，等待垃圾回收的完成。这种现象称之为 STW(Stop-The-World)。
 * 对于交互性较强的应用而言，这种垃圾收集器是不能够接受的。 一般在Javaweb应用中是不会采用该收集器的。
 */
public class TestGC {

    //不断的产生新的数据（对象），随机的废弃对象（垃圾）
    public static void main(String[] args) throws InterruptedException {
        List<Object> list = new ArrayList<Object>();

        while (true) {
            int sleep = new Random().nextInt(100);
            if (System.currentTimeMillis() % 2 == 0) {
                //当前的时间戳是偶数
                list.clear();
            } else {
                //向list中添加10000个对象
                for (int i = 0; i < 10000; i++) {
                    Properties properties = new Properties();
                    properties.put("key_" + i, "value_" + System.currentTimeMillis());
                    list.add(properties);
                }
            }
            Thread.sleep(sleep);

        }

    }
}
