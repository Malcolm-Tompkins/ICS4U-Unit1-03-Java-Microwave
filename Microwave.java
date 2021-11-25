/*
*  Microwave.java
*
* @author  Malcolm Tompkins
* @version 1.0
* @since 2020-11-22
*/

// Imports the scanner class
import java.util.Scanner;
/**
* Calculates the amount of time required to heat up certain food.
*/

final class Microwave {
    /**
    * Constant for the time sub takes.
    */
    public static final double SUB_TIME = 60;
    /**
    * Constant for the time pizza takes.
    */
    public static final double PIZZA_TIME = 45;
    /**
    * Constant for the time soup takes.
    */
    public static final double SOUP_TIME = 105;
    /**
    * Constant for 60 seconds.
    */
    public static final double MINUTE = 60;
    /**
    * Constant for magic number 1.
    */
    public static final double AMOUNT_ONE = 1;
    /**
    * Constant for magic number 2.
    */
    public static final double AMOUNT_TWO = 2;
    /**
    * Constant for magic number 3.
    */
    public static final double AMOUNT_THREE = 3;
    /**
    * Constant for amount multiplier for amount 1.
    */
    public static final double AMOUNT_MULTIPLIER_1 = 1.0;
    /**
    * Constant for amount multiplier for amount 2.
    */
    public static final double AMOUNT_MULTIPLIER_2 = 1.5;
    /**
    * Constant for amount multiplier for amount 3.
    */
    public static final double AMOUNT_MULTIPLIER_3 = 2;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Microwave() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Input and scanner
        final Scanner myObj = new Scanner(System.in);
        double foodTypeTime = 0.0;
        double amountTime = 0.0;
        try {
            System.out.println("Are you heating up a sub, soup, or pizza? ");
            final String foodType = myObj.next();
            try {
                System.out.println("How much " + foodType
                    + " are you heating up: ");
                final double foodAmount = myObj.nextDouble();
                // Process
                if ("sub".equals(foodType)) {
                    foodTypeTime = SUB_TIME;
                } else if ("pizza".equals(foodType)) {
                    foodTypeTime = PIZZA_TIME;
                } else if ("soup".equals(foodType)) {
                    foodTypeTime = SOUP_TIME;
                }
                if (foodAmount == AMOUNT_ONE) {
                    amountTime = AMOUNT_MULTIPLIER_1;
                } else if (foodAmount == AMOUNT_TWO) {
                    amountTime = AMOUNT_MULTIPLIER_2;
                } else if (foodAmount == AMOUNT_THREE) {
                    amountTime = AMOUNT_MULTIPLIER_3;
                }
                final double time = foodTypeTime * amountTime;
                final double minutesDouble = time / MINUTE;
                final int minutes = (int) minutesDouble;
                final double seconds = time % MINUTE;
                // Output
                System.out.println("The total heat up time is " + minutes
                    + " minutes and " + seconds + " seconds");
                System.out.println("\nDone.");
            } catch (java.util.InputMismatchException error) {
                System.out.println("Invalid number");
            }
        } catch (java.util.InputMismatchException error) {
            System.out.println("Invalid food type");
        }
    }
}

