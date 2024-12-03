package com.algorithmn.java;

public class ArrayStructures {

    private int[] theArray = new int[50];
    private  int arraySize = 10;

    private void generateArray(){

        for (int i=0;i<arraySize;i++) {
             theArray[i]= (int)(Math.random()*10)+10;
        }
    }
private void printArray(){

    for (int i=0;i<arraySize;i++) {

        System.out.print(" | " + i +" | ");
        System.out.println(theArray[i] + " | ");
        System.out.println("-----------");
    }
    }
    private void getValueAtIndex(int i){

        if(i<arraySize)
    System.out.println("the value at index " + i + " is " + theArray[i]);
}

private boolean doesArrayContainThisValue(int searchValue) {

        boolean valueInArray=false;
    for (int i = 0; i < arraySize; i++) {
        if(theArray[i] == searchValue)
        {
            valueInArray = true;
    }}
    return valueInArray;
}

private void deleteIndex(int index)
{
    for (int i=index;i<arraySize;i++)
    {
        theArray[i]=theArray[i+1];
    }
    arraySize=
            arraySize-1;
}

private void insertValue(int insertValue)
{
    if(arraySize<50)
    {
        theArray[arraySize]=insertValue;
        arraySize++;
    }
}

private String linearSearchOfValue(int value) {

    boolean valueInArray = false;
    String indexwithvalue = "";
    System.out.println("The value was found in the following ");
    for (int i = 0; i < arraySize; i++) {
        if(theArray[i] == value) {
            valueInArray = true;

        System.out.println(i +" ");
        indexwithvalue +=i+" ";
    }}

    if (!valueInArray) {
        indexwithvalue = "none";
        System.out.println(indexwithvalue);
    }
    System.out.println();
    return indexwithvalue;
}

    public static void main (String[]args){

        ArrayStructures arrayStructures = new ArrayStructures();

        arrayStructures.generateArray();
        arrayStructures.printArray();
        arrayStructures.getValueAtIndex(4);
        System.out.println(
                arrayStructures.doesArrayContainThisValue(16));
 arrayStructures.deleteIndex(5);
 arrayStructures.printArray();
 arrayStructures.insertValue(45);
        arrayStructures.printArray();
        arrayStructures.linearSearchOfValue(11);

    }
}
