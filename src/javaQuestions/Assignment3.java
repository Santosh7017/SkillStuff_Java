package javaQuestions;

import java.util.Scanner;

public class Assignment3 {
    static void reverse(int n){
        int reverse = 0;
        while(n>0) {
            int a = n % 10;
            reverse = reverse*10+a;
            n= n/10;
        }
        System.out.println(reverse);
    }


    static void EvenOddSum(int n) {
       /* Ques.2 Write a program to calculate the sum of even and odd number in the given number input
        */
        int eveSum = 0;
        int oddSum = 0;
        while(n>0) {

            int a = n % 10;
            if(a%2== 0){
               eveSum +=a;
            }else{
                oddSum +=a;
            }
            n = n/10;
        }
        System.out.println("Sum of even numbers is:"+eveSum);
        System.out.println("Sum of odd numbers is: "+oddSum);

    }

    static void pattern(int n){
        /*Ques 3. Write a program to print a pattern

         */

        for(int i = 1;i<=n;i++){
            for (int j =1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }



    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        reverse(number);
        EvenOddSum(number);
        pattern(number);

    }
}
