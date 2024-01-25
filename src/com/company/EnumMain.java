package com.company;

public class EnumMain {
    public static void main(String[] args) {

       // EnumLaptop[] obj = EnumLaptop.values();

        for (EnumLaptop s : EnumLaptop.values())
        {
            System.out.println(s.getI() + " : " +s.name());
        }
    }


}
