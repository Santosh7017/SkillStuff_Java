package javaQuestions;

import java.util.Scanner;

public class Assignment2 {


    public static void HCF(int a,int b){
        //  Ques.1 .Write a program to calculate HCF of Two given number.

        int hcf = 0;

        for (int i = 1;i<=a || i<=b;i++){
            if (a%i == 0 && b%i ==0)
                hcf = i;
            }
        System.out.println("HCF of given two numbers is: "+hcf);
        }



        public void SUM(int a){
            /* Write a program to calculate the sum of first 10 natural number
             */

            int sum = 0;
            for(int i = 1;i<=a;i++){
                sum = sum+i;
            }
            System.out.println("Sum of first 10 natural numbers is: "+sum);
        }


    public void Factorial(int a){
    int factorial = 1;
        if (a == 0) {
            System.out.println("Factorial of" + a + " is 1");
        }else{
    for(int i = 1;i<=a;i++){
        factorial *= i;
    }
            System.out.println("Factorial of "+ a+"is "+ factorial);
        }

    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Assignment2 obj = new Assignment2();

        int a = sc.nextInt();
        int b = sc.nextInt();
        HCF(a,b);
        obj.SUM(a);
        obj.Factorial(a);








    }
}
