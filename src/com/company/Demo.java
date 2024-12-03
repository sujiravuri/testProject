package com.company;

class Calculator{

    public int ad(int num1,int num2){
        int res = num1+num2;
        return res;
    }

}
public class Demo {

    public static void main(String[] args){

        Calculator calc = new Calculator();
       int result = calc.ad(4,5);
        System.out.println(result);
    }

}
