package com;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Main {
    public static void main(String[] args) {
        ByteBuffer buffer= ByteBuffer.allocate(1024);
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.remaining());
        System.out.println(buffer.capacity());
        buffer.get(new byte[]{1,2,3,4,5,6,7,8,9,10,11});
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.remaining());
        System.out.println(buffer.capacity());
        buffer.flip();
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.remaining());
        System.out.println(buffer.capacity());
        buffer.clear();
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.remaining());
        System.out.println(buffer.capacity());

    }
}
