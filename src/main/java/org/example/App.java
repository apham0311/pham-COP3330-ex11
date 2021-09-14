package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0.0;

        System.out.println("How many Euros are you exchanging?");

        double euros = sc.nextDouble();

        System.out.println("What is the exchange rate?");

        double exchangeRate = sc.nextDouble();

        double dollars = currencyConversion(euros, exchangeRate,result);

        System.out.println(euros + " euros at an exchange rate of " + exchangeRate + " is ");
        System.out.println(dollars + " U.S dollars ");

        sc.close();
    }

    public static double currencyConversion(double euros, double exchangeRate,double result) {
        return result = euros * exchangeRate;

    }

}

