package com.pony.first_all.controller;

public interface Teacher_interface {
     String get();
     default String getName(){
         return "name";
     }
     default Integer getAge(){
         return 11;
     }
     static String getSex(){
         return "";
     }
}
