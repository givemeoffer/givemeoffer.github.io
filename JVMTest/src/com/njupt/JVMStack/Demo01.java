package com.njupt.JVMStack;

//演示：java.lang.StackOverflowError
public class Demo01 {
    private static int count;

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(count);
        }
    }

    private static void method1() {
        count++;
        method1();
    }
}
