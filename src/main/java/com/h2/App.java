package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        return number*2;
    }
    private static int add(int[] input) {
    	int sum =0;
    	for(int number: input) {
    		sum=sum+number;
    	}
    	return sum;
    }
}
