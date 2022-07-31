package com.njupt.JVMStack;

//演示死锁
class A{};
class B{};
public class Demo02 {
    static A a = new A();
    static B b = new B();

    public static void main(String[] args) {
        new Thread(() -> {
            synchronized (a) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (b) {
                    System.out.println("我获得了a和b");
                }
            }
        }).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            synchronized (b) {
                synchronized (a) {
                    System.out.println("我获得了a和b");
                }
            }
        }).start();
    }
}
