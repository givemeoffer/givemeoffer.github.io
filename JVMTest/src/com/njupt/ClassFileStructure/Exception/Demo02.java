package com.njupt.ClassFileStructure.Exception;

public class Demo02 {
    public static void main(String[] args) {
        int i = 0;
        try {
            i = 10;
        } catch (ArithmeticException e) {
            i = 30;
        } catch (NullPointerException e) {
             i = 40;
        } catch (Exception e) {
            i = 50;
        }
    }
}
