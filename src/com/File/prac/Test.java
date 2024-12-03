package com.File.prac;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TransientDemo1 demo1 =
                new TransientDemo1(1, "Hello Java");
        String filename = "File.txt";

        FileOutputStream fileOutputStream =
                new FileOutputStream(filename);

        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(demo1);
        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("object has been serialized");


        //Deserialization
        TransientDemo1 obj1 = null;
        FileInputStream fileInputStream =
                new FileInputStream(filename);
        ObjectInputStream objectInputStream =
                new ObjectInputStream(fileInputStream);

        obj1= (TransientDemo1) objectInputStream.readObject();
fileInputStream.close();
objectInputStream.close();

        System.out.println();
    }
}
