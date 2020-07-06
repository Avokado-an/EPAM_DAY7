package com.anton.day7.main;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("1 - rus\t2 - german\tany other - eng\t0 - escape");
            try {
                choice = in.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input. Default settings applied");
                choice = 0;
            }
            String country = "";
            String language = "";
            if (choice == 1) {
                country = "ru";
                language = "RU";
            } else if (choice == 2) {
                country = "de";
                language = "DE";
            }
            Locale current = new Locale(language, country);
            ResourceBundle rb = ResourceBundle.getBundle("property.text", current);
            String congratulation1 = rb.getString("congratulation1");
            System.out.println(congratulation1);
            String congratulation2 = rb.getString("congratulation2");
            System.out.println(congratulation2);
        }
    }
}
