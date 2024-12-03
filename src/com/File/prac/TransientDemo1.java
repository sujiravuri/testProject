package com.File.prac;

import java.io.Serializable;

public class TransientDemo1 implements Serializable {

    private int a;
    private String b;

    public TransientDemo1(int a,String b)
    {
        this.a=a;
        this.b=b;
    }
}


