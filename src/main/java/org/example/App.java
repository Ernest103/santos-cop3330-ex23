package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ernesto Santos
 */

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        char choice = ' ';

        System.out.print("Is the car silent when you turn the key?(y/n) ");
        choice = sc.next().charAt(0);

        if(Character.toLowerCase(choice) == 'y')
        {
            System.out.print("Are the battery Terminal corroded?(y/n) ");
            choice = sc.next().charAt(0);
            if(Character.toLowerCase(choice) == 'y')
            {
                System.out.println("Clean the terminals and try to start again.");
                System.exit(0);
            }
            else if(Character.toLowerCase(choice) == 'n')
            {
                System.out.println("Replace cables and try again.");
                System.exit(0);
            }
        }
        else if(Character.toLowerCase(choice) == 'n')
        {
            System.out.print("Does the car make a slicking noise?(y/n) ");
            choice = sc.next().charAt(0);
            if(Character.toLowerCase(choice) == 'y')
            {
                System.out.println("Replace the battery and try again.");
                System.exit(0);
            }
            else if(Character.toLowerCase(choice) == 'n')
            {
                System.out.print("Does the car crank up but fail to start?(y/n) ");
                choice = sc.next().charAt(0);
                if(Character.toLowerCase(choice) == 'y')
                {
                    System.out.println("Check spark plugs connections.");
                    System.exit(0);
                }
                else if(Character.toLowerCase(choice) == 'n')
                {
                    System.out.print("Does the engine start and Die?(y/n) ");
                    choice = sc.next().charAt(0);
                    if(Character.toLowerCase(choice) == 'y')
                    {
                        System.out.print("Does your care have fuel injection?(y/n) ");
                        choice = sc.next().charAt(0);
                        if(Character.toLowerCase(choice) == 'y')
                        {
                            System.out.println("Get it in for service.");
                            System.exit(0);
                        }
                        else if(Character.toLowerCase(choice) == 'n')
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                            System.exit(0);
                        }
                    }
                    else
                    {
                        System.out.println("Invalid case.");
                        System.exit(0);
                    }
                }
            }
        }


    }
}
