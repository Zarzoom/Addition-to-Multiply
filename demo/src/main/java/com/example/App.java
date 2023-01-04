package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator testing= new Calculator();
        System.out.println(testing.multiply(0, 0));
        System.out.println(testing.multiply(2, 5));
        System.out.println(testing.multiply(5, 2));
        System.out.println(testing.multiply(1, 9));
        System.out.println(testing.multiply(9, 1));
        System.out.println(testing.multiply(5, 0));
        System.out.println(testing.multiply(0, 5));
    }
}
