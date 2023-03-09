package javabasics_ex_3._3;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        System.out.println('f');
        System.out.println('r');
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        System.out.println("My age = 23");
        System.out.println("I had lunch today = true");
        System.out.println("My Lunch price is = 4.99");
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        int age = 23;
        boolean hadLunchToday = true;
        double lunchPrice = 4.99;

        System.out.print("My age = ");
        System.out.println(age);
        System.out.print("I had lunch today = ");
        System.out.println(hadLunchToday);
        System.out.print("My Lunch price is = ");
        System.out.println(lunchPrice);

        /*System.out.println("My age = " + age);
        System.out.println("I had lunch today = " + hadLunchToday);
        System.out.println("My Lunch price is = " + lunchPrice);*/
    }
}
