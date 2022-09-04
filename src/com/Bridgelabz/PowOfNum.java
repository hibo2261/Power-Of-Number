package com.Bridgelabz;
import java.util.Scanner ;

public class PowOfNum {
    public static void main (String[] args){
        System.out.println("********************************************");
        System.out.println(" Welcome to Power of a number...");
        System.out.println("********************************************");
        /*
        creating a variable
         */
        int a , b , pro =1;
        /*
        Taking input from user
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Base Number = ");
        a = sc.nextInt();
        System.out.println("Enter A Power Number = ");
        b = sc.nextInt();
        /*
        Creating a loop
        for power
         */
        while ( b != 0)
        {
            pro = pro * a;
            b--;
        }
        System.out.println("Power Of Given Number Is = "+pro);






    }
}
