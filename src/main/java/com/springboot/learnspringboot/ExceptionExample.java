package com.springboot.learnspringboot;

public class ExceptionExample {
//    public static void main(String[] args) {
//        System.out.println(m1());
//    }
//    static int m1() {
//        try {
//            return 88;
//        }catch(Exception e) {
//            return 66;
//        }finally {
//            try {
//                System.out.println(10/0);
//                return 77;
//            }catch(Exception e) {
//                return 99;
//            }
//        }
//    }
//    public static int x = 1;
//    public static void main(String argv[]){
//        ExceptionExample t1 = new ExceptionExample();
//        t1.x =100;
//        ExceptionExample t2 = new ExceptionExample();
//        t2.x = 1000;
//        System.out.print("Value1=" + t1.x);
//        System.out.print("Value2=" + t2.x);
//    }

    public static void main(String[] args) {
        Object obj = new Integer(3);
        String str = (String) obj;
        System.out.println(str);
    }
}
