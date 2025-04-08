package com.CWH;

import java.util.Scanner;
public class CWH_16_program {

    public static void main(String[]args){
        //conditional statements
        Scanner sc = new Scanner(System.in);
        //pen = 10; notebook = 50
         int cash = sc.nextInt();
         if(cash < 10) {
             System.out.println("cannot by anything");
             System.out.println("get more cash");
         }

         else if(cash > 10 && cash < 40) {
             System.out.println("can get one thing");
         }


         else {
             System.out.println("can get both");
         }

    }
 }
