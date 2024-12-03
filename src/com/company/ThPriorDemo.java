package com.company;


//    class AD1 implements Runnable{
//        public void run(){
//            for(int i=0;i<10;i++) {
//                System.out.println("Hi");
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//   class BD1 implements Runnable {
//        public void run(){
//            for(int i=0;i<10;i++){
//                System.out.println("Helllo");
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }

public class ThPriorDemo {

        public static void main(String[] args) throws InterruptedException {

            Runnable obj3=  () ->
            {
                for (int i =1; i <=4; i++) {
                    System.out.println("Hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            Runnable obj4= new Runnable() {
                @Override
                public void run() {
            for(int i=1;i<=4;i++){
                System.out.println("Helllo");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace(); }
            }
       }
            };
            Thread t1 = new Thread(obj3);
            Thread t2 = new Thread(obj4);
           t1.start();
            t2.start();
        }
    }

