package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main2 {
    public static void main(String[] args) throws IOException {
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        FileInputStream stream = new FileInputStream(new File("src/file.txt"));
        FileChannel channel = stream.getChannel();
        int read = channel.read(buffer);
        System.out.println(read);
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.remaining());
        System.out.println(buffer.capacity());
        buffer.clear();
    }
}
