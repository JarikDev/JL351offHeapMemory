package com;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class UnsafeObj {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Field field = Unsafe.class.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        Unsafe unsafe = (Unsafe) field.get(null);
        long startAdress = unsafe.allocateMemory(1024);
//        System.out.println(startAdress);
//        unsafe.putInt(startAdress,5);
//        unsafe.putInt(startAdress+4,10);
//        System.out.println( unsafe.getInt(startAdress));
//        System.out.println( unsafe.getInt(startAdress+4));

        Student student=(Student)unsafe.allocateInstance(Student.class);
        student.name="Mihailo";
        System.out.println(student.name);
        System.out.println(student.age);
        unsafe.freeMemory(startAdress);
    }

    static class Student {
        String name;
        int age;

        public Student() {
            this.name = "Jarik";
            this.age = 14;
        }
    }
}
