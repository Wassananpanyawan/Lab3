package com.wassana;

public class Main {
    public static void main(String[] args) {
        demo4();
    }
    public static void demo4(){
        Patient t = new Patient();
        Patient t2 = new Patient("Peter" , "Parker","M","Pete" ,170f,70f);
        //System.out.println(t2.getFristName()+""+t2.getLastName()+"height = "+t2.getHeight());

        System.out.println(t2.toString());
    }
    public static void demo(){
        Person p1 = new Person();
        p1.setFristName("Peter");
        p1.setLastName("Parker");
        p1.setGender("M");
        p1.setNickName("Pete");
        System.out.println(p1.getFristName());
        System.out.println(p1.getLastName());
    }
    public static  void demo2(){
        Person p2 = new Person("peTEr","Parker","Pete","M");
        System.out.println(p2.getFristName());
    }
    public static  void demo3(){
        Person p3 = new Person("peTEr","pete");
        System.out.println(p3.getFristName());
        p3.setFristName("abCDEf");
        System.out.println(p3.getFristName());
    }
}
