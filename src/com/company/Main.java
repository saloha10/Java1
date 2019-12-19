package com.company;

public class Main {

    public static void main(String[] args) {

         int min = Integer.MIN_VALUE;
         int max = Integer.MAX_VALUE;

    

    System.out.println("Minimum int: " + min);
    System.out.println("Maximum int: " + max);
    System.out.println();
        System.out.println("Overflow and Underflow");
    System.out.println("Min value " + (Integer.MIN_VALUE));
    System.out.println("Max value " + (Integer.MAX_VALUE));
    System.out.println();

         byte minbyte = Byte.MIN_VALUE;
         byte maxbyte = Byte.MAX_VALUE;

    System.out.println("Minimum byte: " + minbyte);
    System.out.println("Maximum byte: " + maxbyte);
    System.out.println();

         short minshort = Short.MIN_VALUE;
         short maxshort = Short.MAX_VALUE;

    System.out.println("Minimum short: " + minshort);
    System.out.println("Maximum short: " + maxshort);
    System.out.println();

         long longvalue = 100L;
         long minLong = Long.MIN_VALUE;
         long maxLong = Long.MAX_VALUE;

        System.out.println("Minimum Long: " + minLong);
        System.out.println("Maximum Long: " + maxLong);
        System.out.println();


         int total = (min / 2);

        System.out.println(total);
    }
}
