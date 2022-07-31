package com.njupt.GC.fourReference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

//演示弱引用，配合引用队列
public class Demo04 {
    private static final int _4MB = 4 * 1024 * 1024;

    public static void main(String[] args) {
        List<WeakReference<byte[]>> list = new ArrayList<>();

        //引用队列
        ReferenceQueue<byte[]> queue = new ReferenceQueue<>();

        for (int i = 0; i < 5; i++) {
            //关联了软引用队列，当软引用所关联的byte[]被回收时，软引用自己会加入到 queue 中去
            WeakReference<byte[]> ref = new WeakReference<>(new byte[_4MB],queue);
            System.out.println(ref.get());
            list.add(ref);
            System.out.println(list.size());
        }

        //从队列中获取无用的软引用对象，并移除
        Reference<? extends byte[]> poll = queue.poll();
        while (poll != null) {
            list.remove(poll);
            poll = queue.poll();
        }

        System.out.println("==========");
        for (WeakReference<byte[]> reference : list) {
            System.out.println(reference.get());
        }
    }
}
