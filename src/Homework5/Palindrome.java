package Homework5;

import java.util.Scanner;

public class Palindrome {
/*

    public static void main(String[] arg) { //main method

        //character array of size, 80
        char[] characters;
        int size;
        boolean flag;

        //Declaration of strings
        String line = "";
        String choice;
        Scanner keyboard = new Scanner(System.in);
        String value;

        do {
            System.out.println("Enter a line of characters terminated by " + "period(.)");

            //initialize all the variables.
            line = "";
            characters = new char[80];
            size = 0;
            flag = false;

            while (true) {
                //read a word from user.
                value = keyboard.next();

                //condition to check form the period and size
                if (value.contains(".") || size == 80) {
                    for (int i = 0; i < value.length() - 1; i++) {
                        characters[size] = value.charAt(i);
                        size++;
                    }
                    //break the loop to read input
                    break;
                }
                //convert the word into characters
                for (int i = 0; i < value.length(); i++) {
                    characters[size] = value.charAt(i);
                    size++;

                }
                characters[size] = ' ';
                size++;


                //convert to String
                for (int i = 0; i < size; i++) {
                    if (Character.isAlphabetic(characters[i]) || characters[i] == ' ') {
                        line += characters[i];
                    }
                    //if not print an error message and
                    //break the loop
                    else {
                        System.out.println("The content should contain only alphabets and spaces.");
                        System.out.println("Try again!\n");
                        flag = true;
                        break;
                    }
                }
                //if flag is false then check whether the word is palindrome or not and display the message
                if (flag == false) {
                    //call the method isPalindrome,
                    //depending on the return value it
                    //print the respective statement.
                   if (isPalindrome(characters, size))
                        System.out.println("\"" + line + "\"- is a Palindrome");
                    else
                        System.out.println("\"" + line + "\" -is not a Palindrome");

                }


            }
            System.out.println("\nEnter\"yes\"to" + " continue of \"end\"tp" + "terminate:");
            choice = keyboard.next();
            System.out.println();
        } while (!choice.equals("end"));
    }

/*
    public static boolean isPalindrome(char[] a, int used) {

        for (int i = 0, j = used - 1; i < used / 2; i++, j--) {
            //ignore space characters.
            if (a[i] == ' ' || a[used - 1] == ' ')
                continue;
            if (Character.toLowerCase(a[i]) != Character.toLowerCase(a[j]))
                return false;

        }
        return true;

    }

 */

}


