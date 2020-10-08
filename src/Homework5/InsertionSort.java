/**
 * <h1> InsertionSort </h1>
 * <p>
 *
 * The program sorts the numbers in array
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * Homework5.ArraySorter
 * Homework5.InsertionSort
 * Programming Assignment 7.
 * @since 05-31-2020
 */
package Homework5;

public class InsertionSort extends ArraySorter {
    public static void main(String[] arg) { //main method is defined here.

        int[] b = {7, 5, 11, 2, 16, 4, 18, 14, 12, 30}; //create array of int type.
        System.out.println("Array values before sorting:");
        int i;
        for (i = 0; i < b.length; ++i) // to show which contents is filled  in b array.
            System.out.print(b[i] + " ");
        System.out.println();

        selectionSort(b); // input array b at selectionSort of ArraySorter class.

        System.out.println("Array values after sorting:");
        for (i = 0; i < b.length; ++i) // to show b array that is sorted.
            System.out.print(b[i] + " ");
        System.out.println();
    }

}
