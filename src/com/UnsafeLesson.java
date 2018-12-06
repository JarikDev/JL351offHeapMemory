package com;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeLesson {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field field=Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Unsafe unsafe= (Unsafe)field.get(null);
        long startAdress= unsafe.allocateMemory(1024);
        System.out.println(startAdress);
        unsafe.putInt(startAdress,5);
        unsafe.putInt(startAdress+4,10);
        System.out.println( unsafe.getInt(startAdress));
        System.out.println( unsafe.getInt(startAdress+4));
        unsafe.freeMemory(startAdress);

    }
}
