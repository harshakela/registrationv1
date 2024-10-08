package com.api;

public class C {
    public static void main(String[] args) {
        C a1 = new C();
        int val = a1.test();
        System.out.println(val);
    }
    public int test(){
        System.out.println("Hello");
        return 100;
    }
}
