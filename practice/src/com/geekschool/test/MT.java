package com.geekschool.test;

/**
 * Created by caizhongmou on 7/14/16.
 */
public class MT {

    public MT(){
        System.out.println("default constructor");
    }
    public static void mai(String[] arg){
        System.out.println("hello world");
    }


    public int add(int x,int y){
        return x+y;
    }


    public int add(int x,int y,int z){
        return x+y+z;
    }
}
