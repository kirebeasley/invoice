package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> products = new ArrayList<String>();
        ArrayList<Double> prices = new ArrayList<Double>();
        ArrayList<String> purchaseditem = new ArrayList<String>();
        ArrayList<Double> purchasedprice = new ArrayList<Double>();

        products.add("Bison Sweater");
        prices.add(55.99);
        products.add("Bison Tee");
        prices.add(14.99);
        products.add("Bison Hoodie");
        prices.add(23.99);
        products.add("Bison Bumpersticker");
        prices.add(4.99);

        String response = " ";
        do {

            System.out.println("What do you want to do?");
            System.out.println("1) add purchase 2) show purchases 3) finish transaction");
            response = input.nextLine();

            if (response.equals("1")) {
                for (int i = 0; i < products.size(); i++) {
                    System.out.println(products.get(i) + " : $ " + prices.get(i));
                }
                System.out.println("Product: ");
                String product = input.nextLine();
                for (int i = 0; i < products.size(); i++) {
                    if (products.get(i).equals(product)) {
                        purchaseditem.add(product);
                        purchasedprice.add(prices.get(i)); } }

            } if (response.equals("2")) {
                for (int i = 0; i < purchaseditem.size(); i++) {
                    System.out.println(purchaseditem.get(i) + " : $ " + purchasedprice.get(i)); } }

        } while (!response.equals("3"));
        double totalcost = 0.0;
        for (int i = 0; i < purchasedprice.size(); i++) {
            double itembought = purchasedprice.get(i);
            totalcost += itembought; }

        System.out.println("Your total for the day is : " + totalcost);
    }
}




