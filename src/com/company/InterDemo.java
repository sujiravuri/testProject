package com.company;

 interface Computer {
    public abstract void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("In Laptop class");
    }
}

class Desktop implements Computer {
    public void code(){
        System.out.println("In Desktop Class");
    }
}

class  Developer
{
    public void devapp(Computer comp) {
        comp.code();
    }
    }

public class InterDemo {
    public static void main(String[] a){

        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer obj =new Developer();
         obj.devapp(desk);
    }
  }

