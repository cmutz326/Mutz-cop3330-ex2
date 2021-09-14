/*
*   UCF COP3330 Fall 2021 Assignment 1 Solution
*   Copyright 2021 Mutz Christina
*
*   Example 2 solution
 */



import java.util.Scanner;
public class ex2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int count = 0;                                               //make sure counting starts at 0
     System.out.println("What is the input string?");                //ask user to say a word or phrase
    var phrase = sc.nextLine();                               //save the phrase the user input

   for (int i= 0; i < phrase.length(); i++)                           //tell system to count strings length
        {
            if(phrase.charAt(i) != ' ')                              //for each character, the count will go up
                count++;
        }




    System.out.println(phrase + " has " + count + " characters.");   //tell the user how many characters the input contained

    }

}
