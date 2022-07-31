package com.njupt.ClassFileStructure.translater;

public class Candy4 {
    public static void foo(String... args) {
        String[] array = args; // 直接赋值
        System.out.println(array);
    }

    public static void main(String[] args) {
        foo("hello","world");
    }
}
