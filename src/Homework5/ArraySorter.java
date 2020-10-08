package Homework5;
//ArraySorter.java

/**
 * Class for sorting an array of base type int from smallest to largest.
 */
public class ArraySorter {
    /**
     * Precondition: Every element in anArray has a value.
     * Action: Sorts the array into ascending order.
     */
    public static void selectionSort(int[] anArray) {
        for (int index = 0; index < anArray.length - 1; index++) {   // Place the correct value in anArray[index]
            int indexOfNextSmallest = getIndexOfSmallest(index, anArray);
            interchange(index, indexOfNextSmallest, anArray);
            //Assertion:anArray[0] <= anArray[1] <=...<= anArray[index]
            //and these are the smallest of the original array elements.
            //The remaining positions contain the rest of the original
            //array elements.
        }
    }

    /**
     * Returns the index of the smallest value in the portion of
     * array that begins at the element whose index is startIndex
     * ends at the last element.
     */
    private static int getIndexOfSmallest(int startIndex, int[] a) {
        int min = a[startIndex];
        int indexOfMin = startIndex;
        for (int index = startIndex + 1; index < a.length; index++) {
            if (a[index] < min) {
                min = a[index];
                indexOfMin = index;
                // Assertion: min is smallest of a[startIndex] through a[index]
            }
        }
        return indexOfMin;
    }

    /**
     * Precondition: i and j are valid indices for the array a.
     * Postcondition: Values of a[i] and a[j] have been interchanged.
     */
    private static void interchange(int i, int j, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp; //original value of a[i]
    }
/*
* Listing 7.10,7.11
    public static void main(String[] arg) { //main method is defined here.
        int[] b = {7, 5, 11, 2, 16, 4, 18, 12, 30};
        display(b, "before");
        ArraySorter.selectionSort(b);
        display(b, "after");
    }

    public static void display(int[] array, String when) {

        System.out.println("Array values " + when + " sorting : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");

        }
        System.out.println();
    }
*/

}