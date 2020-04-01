package com.venvo.jvm;

/**
 * @author venvo
 * @date 2020-04-01 15:37
 * @description jvm
 * @modified By
 * @version: jdk1.8
 */
public class TestJVM {
    public static void main(String[] args) {
        String str = System.getProperty("str");
        if (str==null){
            System.out.println("venvo");
        }else {
            System.out.println(str);
        }
        System.gc();
    }
}
