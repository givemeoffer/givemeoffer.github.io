package com.njupt.ClassFileStructure.Exception;

public class Demo07 {
    public static void main(String[] args) {
        Object lock = new Object();
        synchronized (lock) {
            System.out.println("ok");
        }
    }
}
