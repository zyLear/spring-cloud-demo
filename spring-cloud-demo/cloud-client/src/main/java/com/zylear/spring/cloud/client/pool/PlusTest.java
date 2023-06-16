package com.zylear.spring.cloud.client.pool;

public class PlusTest {

    public static void main(String[] args) {
        int i = 1;
        int b = 0;
        int a = i++;
        System.out.println(a + " " + b + " " + i);
        i = 1;
        b = ++i;
        System.out.println(a + " " + b + " " + i);


        a = 3;
        b = 3;
        i = 1;
        a = (i++);
        System.out.println(a + " " + b + " " + i);
        i = 1;
        b = (++i);
        System.out.println(a + " " + b + " " + i);

        System.out.println();
    }
}
