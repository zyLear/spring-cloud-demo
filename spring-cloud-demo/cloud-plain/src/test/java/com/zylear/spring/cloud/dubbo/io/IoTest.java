package com.zylear.spring.cloud.dubbo.io;

import org.junit.jupiter.api.Test;
import sun.nio.ch.DirectBuffer;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/**
 * @author xiezongyu
 * @date 2021/4/7
 */
public class IoTest {

    @Test
    public void bio() throws IOException {

        FileInputStream in = new FileInputStream(new File(""));
        byte bytes[] = new byte[1024];
        in.read(bytes);

        ServerSocketChannel ss = ServerSocketChannel.open();
        ss.bind(new InetSocketAddress("host", 1));
        System.out.println(" NIO server started ... ");
        ss.configureBlocking(false);
        while (true) {
            final SocketChannel socket = ss.accept();//阻塞方法
            socket.configureBlocking(false);
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

            int read = socket.read(byteBuffer);
            byteBuffer.flip();
            System.out.println("请求：" + new String(byteBuffer.array()));
            String resp = "服务器响应";
            byteBuffer.get(resp.getBytes());
            socket.write(byteBuffer);
        }

    }


    @Test
    public void nio() {

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(10240);
        byteBuffer.put((byte) 1);

    }

    @Test
    public void mappedByteBuffer() throws IOException {
        // 通过 RandomAccessFile 创建对应的文件操作类，第二个参数 rw 代表该操作类可对其做读写操作
        RandomAccessFile raf = new RandomAccessFile("fileName", "rw");

        // 获取操作文件的通道
        FileChannel fc = raf.getChannel();

        // 也可以通过FileChannel的open来打开对应的fc
        // FileChannel fc = FileChannel.open(Paths.get("/usr/local/test.txt"),StandardOpenOption.WRITE);


        // 把文件映射到内存
        MappedByteBuffer mbb = fc.map(FileChannel.MapMode.READ_WRITE, 0, (int) fc.size());

        // 读写文件
        mbb.putInt(4);
        mbb.put("test".getBytes());
        mbb.force();

        mbb.position(0);
        mbb.getInt();
//        mbb.get(new byte["test".getBytes().size()]);
    }

}
