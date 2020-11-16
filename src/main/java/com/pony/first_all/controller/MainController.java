package com.pony.first_all.controller;

public class MainController {
    public static void main(String[] args) {
        System.out.println(get());

    }
    public static  int get() {
        int i=0;
        try {
            i=1;
            int b=0/0;
            return i;
        } catch (Exception e) {
        } finally {
            i=3;
            System.out.println(i);
        }
        System.out.println(i);
        return i;
    }
}
