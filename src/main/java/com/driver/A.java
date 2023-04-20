package com.driver;

public class A {
   // B obj = new B();
   // B.meth();
    public static void meth(){
        System.out.println("Invoking method from class A");

    }
}
class B extends A{
    // B obj = new B();

    public static void meth(){
        System.out.println("Method is overridden in Extendend class B");
    }

}