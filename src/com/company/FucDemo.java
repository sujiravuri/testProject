package com.company;

@FunctionalInterface
interface A1{
    int add(int i,int j);
}

public class FucDemo {
    public static void main(String[] args)
    {
        A1 obj = (i,j)->i+j;
        System.out.println(obj.add(5,4));
    }
}
