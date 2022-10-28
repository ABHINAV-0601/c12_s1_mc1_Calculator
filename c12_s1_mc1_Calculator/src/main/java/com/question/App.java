package com.question;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select operations you want to do" + "\n" +
                "Press 1 for addition" + "\n" +
                "Press 2 for subtraction" + "\n" +
                "Press 3 for multiplication" + "\n" +
                "Press 4 for modulo" + "\n" +
                "Press 5 for division");
        int a = scanner.nextInt();
        switch (a){
            case 1:
                System.out.println("Enter two numbers");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                System.out.println("Addition of these numbers is = " + calc.add(num1,num2));
                break;
            case 2:
                System.out.println("Enter two numbers");
                int num3 = scanner.nextInt();
                int num4 = scanner.nextInt();
                System.out.println("Subtraction of these numbers is = " + calc.subtract(num3,num4));
                break;
            case 3:
                System.out.println("Enter two positive numbers");
                double num5 = scanner.nextDouble();
                double num6 = scanner.nextDouble();
                System.out.println("Multiplication of these numbers is = " + calc.multiply(num5,num6));
                break;
            case 4:
                System.out.println("Enter two positive numbers");
                int num7 = scanner.nextInt();
                int num8 = scanner.nextInt();
                System.out.println("Modulous of these numbers is = " + calc.modulo(num7,num8));
                break;
            case 5:
                System.out.println("Enter two positive numbers");
                int num9 = scanner.nextInt();
                int num10 = scanner.nextInt();
                System.out.println("Division of these numbers is = " + calc.divide(num9,num10));
                break;
        }
    }
}
