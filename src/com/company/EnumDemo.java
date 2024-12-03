package com.company;

import java.util.Arrays;

enum Status{
  Running,Failed,Pending,Success;
}

public class EnumDemo {

    public static void main(String[] args) {
        Status  s = Status.Failed;


        if (s == Status.Running)
 {  System.out.println("Running");
        }

        else if (s==Status.Pending)
        {
            System.out.println("Pending");
        }
        else if(s==Status.Success) {
            System.out.println("Success");
        }
            else
        {
            System.out.println("Failed");
        }
        }
    }

