package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        for (int i=0; i<array.length; i++){

            int lowestNum = array[i];
            int indexToSwap = i;

            for (int j=i; j<array.length; j++){
                if (array[j]<=lowestNum){
                    lowestNum=array[j];
                    indexToSwap=j;
                }
            }
            if (indexToSwap!=i){
                int temp = array[i];
                array[i] = array[indexToSwap];
                array[indexToSwap] = temp;
            }
        }

        System.out.println(Arrays.toString(array));
    }

}
