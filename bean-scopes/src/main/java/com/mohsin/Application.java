package com.mohsin;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );

        Runnable r = () -> System.out.println( "Hello Mohsin!" );

        Runnable r1 = () -> System.out.println( "Hello Mohsin!" );
        Thread thread1 = new Thread(r);
        thread1.start();
        Thread thread2 = new Thread(r1);
        thread2.start();

//        System.out.println(r.equals(r1));
        System.out.println("r "+r.hashCode());
        System.out.println("r1 "+r1.hashCode());

//        System.out.println(thread1.equals(thread2));
        System.out.println("th1 "+thread1.hashCode());
        System.out.println("th2 "+thread2.hashCode());
    }
}
