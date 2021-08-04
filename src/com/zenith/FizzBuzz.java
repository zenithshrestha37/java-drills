package com.zenith;

public class FizzBuzz { // starting a class FizzBuzz
    public static void main(String[] args) { // initializing main method
        fizzBuzz100(); // calling the method
    }

    private static void fizzBuzz100() {
        for (int i = 1; i <= 100; i++) { // initializing for loops starting from 1 and continuing for 100 iterations. every iteration processes with the increment of 1
            if ((i % 3) == 0) // providing a condition where iteration when divided by 3 has a remainder 0
                System.out.println("fizz"); // if the condition is met print "fizz"
            else if ((i % 5) == 0) // providing a condition where iteration when divided by 5 has a remainder 0
                System.out.println("buzz"); // if the above condition is met print "buzz"
            else if (((i % 5) == 0) && ((i % 3) == 0)) // providing a condition where iteration when divided by 5 and 3 has a remainder 0
                System.out.println("fizzbuzz");// if the above condition is met print "fizzbuzz"
            else // else is used where  none of the above condition is met
                System.out.println(i); // if the none of the above mentioned conditions are met then print i
        }
    }
}

// bug
// The else if statement in line 14 has to be the first if condition.

