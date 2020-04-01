package com.venvo.jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author venvo
 * @date 2020-04-01 19:01
 * @description 模拟内存溢出
 * @modified By
 * @version: jdk1.8
 */
public class TestJvmOutOfMemory {


     //参数如下:
     //‐Xms8m ‐Xmx8m ‐XX:+HeapDumpOnOutOfMemoryError     vm options
    //向集合中添加100万个字符串，每个字符有100个UUID组成
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 1000000; i++) {
            String str = "";
            for (int j = 0; j < 1000; j++) {
                str += UUID.randomUUID().toString();
            }
            list.add(str);
        }
        System.out.println("ok");
    }
}
