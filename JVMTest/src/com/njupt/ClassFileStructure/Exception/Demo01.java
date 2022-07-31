package com.njupt.ClassFileStructure.Exception;

public class Demo01 {
    public static void main(String[] args) {
        int i = 0;
        try {
            i = 10;
        } catch (Exception e) {
            i = 20;
        }
    }
}
