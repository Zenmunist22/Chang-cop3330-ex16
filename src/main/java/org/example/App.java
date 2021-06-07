package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class App 
{
    public static void main( String[] args )
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your age? ");
        age = sc.nextInt();
        String message = age >= 16 ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
        System.out.print(message);
    }
}
