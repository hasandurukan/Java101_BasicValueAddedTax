package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type a price :");
        double price = input.nextDouble();
        double taxRatio = price > 1000 ? 0.08 : 0.18;
		double priceWithTax=price+(price*taxRatio);
		double taxPrice=price*taxRatio;
		System.out.println("Price without tax :"+price);
		System.out.println("Price with value-added tax :"+priceWithTax);
		System.out.print("Value-added tax :"+taxPrice);
    }
}
