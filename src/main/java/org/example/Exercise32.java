package org.example;
/*  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Ryan Newton*/
import java.util.*;
public class Exercise32
{
    public static void main(String[] args) {

        System.out.println("Let's play Guess the Number!");
        int secretNum;
        secretNum = (int) (Math.random() * 999 + 1);
        Scanner scan = new Scanner(System.in);
        int guess,total=0,key;

        while(true){

            total=0;
            //output
            System.out.print("Enter the difficulty level(1, 2, or  3): ");
            key=scan.nextInt();

            if(key==1) //random number
                secretNum = (int) (Math.random() * 10 + 1);
            else if(key==2) //random number
                secretNum = (int) (Math.random() * 100 + 1);
            else  //random number
                secretNum = (int) (Math.random() * 1000 + 1);

            System.out.print("I have my number. What's your guess?: ");
            do{
                guess = scan.nextInt(); //read the data
                total++; //count
                if (guess == secretNum){
                    System.out.println("You got it in "+total+"  guesses!");
                }
                else if (guess < secretNum)
                    System.out.println("Too low. Guess again: ");
                else if (guess > secretNum)
                    System.out.println("Too high. Guess again: ");

            }while (guess != secretNum);
            System.out.print("\nDo you wish to play again (Y/N)?  ");
            char s=scan.next().charAt(0);
            if(s=='N' || s=='n')
                break;
        }
    }
}
