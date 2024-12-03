package com.company;
class Student{

    int rollno;
    String name;
    double marks;
}
public class Arrayobj {

    public static void main(String[] args){

        Student stud1 = new Student();

        stud1.name ="Sujitha";
        stud1.rollno=678;
        stud1.marks=89.56;

        Student stud2 = new Student();

        stud2.name ="Rajesh";
        stud2.rollno=698;
        stud2.marks=92.56;

        Student stud3 = new Student();

        stud3.name ="Paavan";
        stud3.rollno=690;
        stud3.marks=84.96;

        Student Students[] = new Student[3];

        Students[0] = stud1;
        Students[1] = stud2;
        Students[2] = stud3;

      /*  for (int i=0;i<Students.length;i++)
        {
            System.out.println(Students[i].marks  +  Students[i].name
            + Students[i].rollno);
        }*/

        for (Student m :Students)
        {
            System.out.println(m.marks +
                    ":" + m.name +":" + m.rollno);
        }
    }
}
