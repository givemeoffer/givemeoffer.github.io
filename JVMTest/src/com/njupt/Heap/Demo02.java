package com.njupt.Heap;

//演示堆内存
public class Demo02 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1...");
        Thread.sleep(30000);
        byte[] array = new byte[1024*1024*10];//10MB
        System.out.println("2...");
        Thread.sleep(30000);
        array = null;
        System.gc();//进行垃圾回收
        System.out.println("3...");
        Thread.sleep(1000000L);
    }
}
