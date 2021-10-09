package javaQuestions;

import java.util.*;

public class firstQuestions {
    public static void main(String args[]){
        // 1
      Scanner sc = new Scanner(System.in);
    /* int number = sc.nextInt();
    if((number > 100 ) && (number<500)){
        if (number%2 == 0){
            System.out.println("Entered no. is even");
        }else{
            System.out.println("Entered no. is odd");
        }
    }else if (number <100){
        System.out.println("No. is smaller than ");
    }else {
        System.out.println("No. is gretor than 500");
    } */

        //2
        /* System.out.print("Enter the character: ");
        char c = sc.next().charAt(0);
        switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Entered character is vowel");
                break;
            default:
                System.out.println("Entered character is constant");
        } */
        int marks = sc.nextInt();
        75
        if(marks >90){
            System.out.println("Your is grade is A");
            System.out.println("Perfomance: Excellent");
        }else if(marks ==75){
            System.out.println("your grade is B");
            System.out.println("Perfomance: Good");
        }else if(marks > 60) {
            System.out.println("your grade is C");
            System.out.println("Perfomance: Pass");

        }else{
            System.out.println("Fail");

        }



    }
    }

