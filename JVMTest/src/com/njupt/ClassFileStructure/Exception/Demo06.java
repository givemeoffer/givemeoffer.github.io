package com.njupt.ClassFileStructure.Exception;

public class Demo06 {
    public static void main(String[] args) {
        int result = test();
        System.out.println(result);
    }

    public static int test() {
        int i = 10;
        try {
            return i;
        } finally {
            i = 20;
        }
    }
}
