/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = in.nextLine();

        System.out.print("Enter a verb: ");
        String verb = in.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = in.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = in.nextLine();

        String output = "Did you " + verb + " across the " + adjective + " " + noun + " " + adverb + "? That's wild!";
        System.out.print(output);
    }
}
