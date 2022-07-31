package com.njupt.GC.fourReference;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

//弱引用演示
//设置如下参数，打印详细信息：-Xmx20m -XX:+PrintGCDetails -verbose:gc
public class Demo03 {
    private static final int _4MB = 4 * 1024 * 1024;

    public static void main(String[] args) {
        //list --> WeakReference --> byte[]
        List<WeakReference<byte[]>> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            WeakReference<byte[]> ref = new WeakReference<>(new byte[_4MB]);
            list.add(ref);
            for (WeakReference<byte[]> w : list) {
                System.out.println(w.get() + "");
            }
            System.out.println();
        }
        System.out.println("循环结束：" + list.size());
    }
}
