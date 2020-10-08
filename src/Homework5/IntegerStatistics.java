/**
 * <h1> IntegerStatistics </h1>
 * <p>
 *
 * 사용자가 원하는 숫자 만큼 입력 하고 그 숫자가 모든 숫자들의 합에 얼마나 차지 하는지
 * 계산하는 프로그램입니다.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac IntegerStatistics.java
 * @Run : java IntegerStatistics
 * Programming Assignment 4.
 * @since 05-26-2020
 */
package Homework5; //name of package.

import java.util.Scanner; //to import scanner.

public class IntegerStatistics {

    public static void main(String[] arg) { //main method is defined here.

        Scanner kb = new Scanner(System.in); //create scanner object.

        System.out.println("How many numbers will you enter?");
        int k = kb.nextInt(); //to get number from user.

        int[] integers = new int[k]; // create array of int type

        System.out.println("Enter 4 integers, one per line:");
        for (int i = 0; i < k; i++) { // 사용자로부터 입력 받은 크기 만큼.
            integers[i] = kb.nextInt(); //enter to array that is from user
        }

        int sum = calcSum(integers);
        System.out.println(String.format("The sum is %d", sum));

        double percent;
        int number;
        System.out.println("The numbers are:");
        for (int i = 0; i < k; i++) { // 사용자로부터 입력 받은 크기 만큼.
            number = integers[i]; // input all number in integers array to number.
            percent = number / (double) sum * 100.00; // to calculate the percentage contribution to the sum.
            System.out.println(String.format("%d, which is %.4f%% of the sum.",
                    number, percent));
        }
    }

    public static int calcSum(int[] array) { //The method for summing all of number
        int sum = 0; //initialization.

        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // to sum all of number that user input.
        }

        return sum;
    }
    }


