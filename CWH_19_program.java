package com.CWH;
import java.util.Scanner;
public class CWH_19_program {

    public static void main(String[]args){
        //Loop
        Scanner sc = new Scanner(System.in);
        int number = 0;
         do{
             System.out.println("Input a number");
              number = sc.nextInt();
             System.out.print("here is your numbe : ");
             System.out.println(number);
         }while(number >= 0);

        System.out.println("THE END");

    }
}
