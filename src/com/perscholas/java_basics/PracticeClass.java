package com.perscholas.java_basics;

public class PracticeClass {
    public static void main(String[] args) {

        // Exercise 1: Add two integer variables
        int num1 = 5;
        int num2 = 10;
        int sumIntegers = num1 + num2;
        System.out.println("Sum of integers: " + sumIntegers);

        // Exercise 2: Add two double variables
        double num3 = 5.5;
        double num4 = 10.5;
        double sumDoubles = num3 + num4;
        System.out.println("Sum of doubles: " + sumDoubles);

        // Exercise 3: Add an integer and a double variable
        int num5 = 5;
        double num6 = 10.5;
        double sumIntAndDouble = num5 + num6;
        System.out.println("Sum of int and double: " + sumIntAndDouble);

        // Exercise 4: Divide larger integer by smaller integer
        int largerInt = 20;
        int smallerInt = 4;
        int divisionResult = largerInt / smallerInt;
        System.out.println("Result of integer division: " + divisionResult);

        // Now, the larger number to a decimal (double)
        double largerDouble = 20.0;
        double divisionResultWithDouble = largerDouble / smallerInt;
        System.out.println("Result of division with decimal: " + divisionResultWithDouble);

        // Exercise 5: Divide two double variables and cast the result to an integer
        double num7 = 15.5;
        double num8 = 4.5;
        double divisionResultDoubles = num7 / num8;
        System.out.println("Division result with doubles: " + divisionResultDoubles);

        // Cast the result to an integer
        int divisionResultCastToInt = (int) divisionResultDoubles;
        System.out.println("Division result cast to integer: " + divisionResultCastToInt);

        // Exercise 6: Assign numbers to x and y and print results with and without casting
        int x = 5;
        int y = 6;
        int q = y / x;
        System.out.println("Result of integer division (y/x): " + q);

        // Cast y to double and assign to q
        double qWithDouble = (double) y / x;
        System.out.println("Result of division with y as double: " + qWithDouble);

        // Exercise 7: Declare a constant and use it in a calculation
        final double PI = 3.14159;
        double radius = 5;
        double area = PI * radius * radius;
        System.out.println("Area of circle with radius " + radius + ": " + area);

        // Exercise 8: Cafe order with products, subtotal, totalSale, and sales tax
        double coffeePrice = 2.5;
        double cappuccinoPrice = 3.5;
        double espressoPrice = 2.0;

        int coffeeQuantity = 3;
        int cappuccinoQuantity = 4;
        int espressoQuantity = 2;

        final double SALES_TAX = 0.08;  // 8% sales tax

        double subtotal = (coffeePrice * coffeeQuantity) + (cappuccinoPrice * cappuccinoQuantity) + (espressoPrice * espressoQuantity);
        double totalSale = subtotal + (subtotal * SALES_TAX);

        // Format the results to two decimal places
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Total Sale with tax: $%.2f\n", totalSale);
    }
}
