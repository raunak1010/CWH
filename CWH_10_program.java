package com.CWH;

public class CWH_10_program {

    public static void main(String[]args){
        //casting
        //Implicit casting
        double price = 100.00;
        double finalPrice = price + 18;
        System.out.println(finalPrice);

        //Explicit casting
        int p = 100;
        int fp = p + (int)18.0;
        System.out.println(fp);
    }
}
