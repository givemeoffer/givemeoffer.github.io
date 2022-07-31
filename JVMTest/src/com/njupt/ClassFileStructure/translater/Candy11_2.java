package com.njupt.ClassFileStructure.translater;

public class Candy11_2 {
    public static void test (final int x) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("ok:" + x);
            }
        };
    }
}
