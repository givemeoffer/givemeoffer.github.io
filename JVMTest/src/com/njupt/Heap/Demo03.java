package com.njupt.Heap;

import java.util.ArrayList;
import java.util.List;

//演示查看对象个数 堆转储 dump
public class Demo03 {
    public static void main(String[] args) throws InterruptedException {
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            students.add(new Student());
        }
        Thread.sleep(100000000L);
    }
}

class Student {
    private byte[] big = new byte[1024*1024];
}
