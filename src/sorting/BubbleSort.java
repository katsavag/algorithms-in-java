package sorting;

import java.util.Arrays;

// This class implements the bubble sort algorithm
// Bubble sort comes with complexity of O(n^2) makes bad choice for large datasets.
public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};
        BubbleSort bubbleSort = new BubbleSort();
        for(int lastIndex=array.length-1; lastIndex>0; lastIndex--){
           for (int j = 0; j<lastIndex; j++){
                bubbleSort.swapItems(array, j);
           }
        }

        System.out.println(Arrays.toString(array));
    }

    public void swapItems(int[] array, int swapIndex){
        if (array[swapIndex]<=array[swapIndex+1]){
            return;
        }else {
            int temp = array[swapIndex];
            array[swapIndex] = array[swapIndex+1];
            array[swapIndex+1] = temp;
        }
    }
}