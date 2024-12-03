package com.company;

class student{
     int rollno;
     static String name;
     int grade;

     public void printdata(){
         System.out.println(rollno +":"+grade +":" +
                name);
     }
     }


public class StaticString {

    public static void main(String[] args) {

    student st1 = new student();

   st1.grade=3;
   st1.rollno=44;
   student.name="Paavan1";

   student st2 = new student();
   student.name ="Sujitha1";
   st2.rollno=561;
   st2.grade=5;

   st1.printdata();
   st2.printdata();
    }
}
