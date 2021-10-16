package javaQuestions.assignment4;
/* Implement a basic calculator which have basic operation (+,-,*,/) Make seperate method for all operation.
 */

import java.util.*;

public class Q3 {
    public static float addition(float a, float b) {
        float sum = a + b;
        return sum;
    }

    public static float multiplication(float a, float b) {
        float multiply = a * b;
        return multiply;
    }

    public static float division(float a, float b) {
        float divide = a / b;
        return divide;
    }

    public static float subtraction(float a, float b) {
        float subtract = a - b;
        return subtract;
    }

    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
       float addition =  addition(a,b);
       float multiplication = multiplication(a,b);
       float division = division(a,b);
       float subtraction = subtraction(a,b);

        System.out.println("Enter the operation: ");
        char c = sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(addition);
                break;
            case '*':
                System.out.println(multiplication);
                break;
            case '/':
                System.out.println(division);
                break;
            case '-':
                System.out.println(subtraction);
                break;
            default:
                System.out.println("Enter the right operation:");

        }
    }
}
