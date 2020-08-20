import java.util.*;

public class SelectionSort{

    public static void main(String[] args){

        int[] testArray = {3, 5, 8, 1, 0, 2, 4};

        selectionSort(testArray);

        System.out.println(Arrays.toString(testArray));

    }

    public static void selectionSort(int[] arr){

        for(int i = 0; i < arr.length - 1; i++){
            int currentMinIndex = i;

            for(int j = currentMinIndex; j < arr.length; j++){
                if(arr[j] < arr[currentMinIndex]){
                    currentMinIndex = j;
                }
            }

            int temp = arr[currentMinIndex];
            arr[currentMinIndex] = arr[i];
            arr[i] = temp;
        }
    }

}