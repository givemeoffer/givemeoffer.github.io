package com.njupt.Heap;

import java.util.ArrayList;
import java.util.List;

//演示堆内存溢出：java.lang.OutOfMemoryError: Java heap space
public class Demo01 {
    public static void main(String[] args) {
        int i = 0;
        try {
            List<String> list = new ArrayList<>();
            String a = "Hello";
            while (true) {
                list.add(a);//Hello，HelloHello，HelloHelloHello...
                a = a + a;//HelloHello，HelloHelloHello...
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(i);
        }
    }
}
