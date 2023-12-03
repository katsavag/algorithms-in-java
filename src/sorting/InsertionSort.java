package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};


        for (int firstUnSortedIndex = 1; firstUnSortedIndex<array.length; firstUnSortedIndex++) {
            int numToCheck = array[firstUnSortedIndex];
            int j;
            for (j = firstUnSortedIndex; j > 0 && array[j-1]>numToCheck; j--) {
                array[j] = array[j-1];
            }

            array[j]=numToCheck;
        }
        System.out.println(Arrays.toString(array));
    }
}
