package com.company;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         final byte MONTHS_OF_YEAR = 12;
         final byte PERCENT = 100;

         Scanner input = new Scanner(System.in);
         System.out.println("Principal: ");
         int principal = input.nextInt();

         System.out.println("Annual Interest");
         float interest = input.nextFloat();
         float monthlyInterest = interest / PERCENT / MONTHS_OF_YEAR;

         System.out.println("Period (Years)");
         byte year = input.nextByte();
         int numberOfPayment = year * MONTHS_OF_YEAR;

         double m = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayment)) / (Math.pow(1 + monthlyInterest, numberOfPayment) - 1);
         String value = NumberFormat.getCurrencyInstance().format(m);
         System.out.println(value);

    }
}
