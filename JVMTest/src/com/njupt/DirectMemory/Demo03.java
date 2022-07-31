package com.njupt.DirectMemory;

import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.reflect.Field;


//演示ByteBuffer底层的类型
public class Demo03 {
    static int _1Gb = 1024 * 1024 * 1024;

    public static void main(String[] args) throws IOException {
        Unsafe unsafe = getUnsafe();
        //分配内存
        long base = unsafe.allocateMemory(_1Gb);
        unsafe.setMemory(base,_1Gb,(byte) 0);
        System.in.read();
        //释放内存
        unsafe.freeMemory(base);
        System.in.read();
    }

    public static Unsafe getUnsafe() {
        try {
            Field f = Unsafe.class.getDeclaredField("theUnsafe");
            f.setAccessible(true);
            Unsafe unsafe = (Unsafe) f.get(null);
            return unsafe;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
