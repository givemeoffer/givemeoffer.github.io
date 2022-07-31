package com.njupt.ClassFileStructure.ClassLoadingPhase;

public class load4 {
    public static void main(String[] args) {
//        Singleton.test();
        Singleton.getInstance();
    }
}

class Singleton {

    public static void test() {
        System.out.println("test");
    }

    private Singleton() {}

    //内部类中保存单例
    private static class LazyHolder {
        static final Singleton INSTANCE = new Singleton();
        static {
            System.out.println("lazyholder init");
        }
    }

    //第一次调用 getInstance 方法，才会导致内部类加载和初始化其静态成员变量
    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
