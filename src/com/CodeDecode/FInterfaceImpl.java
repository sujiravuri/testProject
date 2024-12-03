package com.CodeDecode;

public class FInterfaceImpl {
    public static void main(String[] args) {
        FInterface total=(a,b)->a*b;
       int product = total.multiply(2,5);
        System.out.println(product);

    }
}
