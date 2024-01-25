package com.company;

public enum EnumLaptop {

    MacBook(2000),XPS(1500),Elite(1200),
    Surface(1400),Lenova;

 private int i;

    EnumLaptop(int i) {
     this.i = i;
    }

    EnumLaptop() {
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}

