/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sathvik Kuthuru
 */

import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {
    // Prompt user for age and retire age
    // Years left = retire age - age
    // Print out years left and the years
    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int currAge = prompt("What is your current age?");
        int retire = prompt("At what age would you like to retire?");
        int diff = retire - currAge;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int endYear = year + diff;

        System.out.printf("You have %d years left until you can retire.\n", diff);
        System.out.printf("It's %d, so you can retire in %d.\n", year, endYear);
    }

    static int prompt(String x) {
        System.out.println(x);
        return scan.nextInt();
    }
}