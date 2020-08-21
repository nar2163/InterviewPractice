import java.util.*;

public class MergeSort{

    public static void main(String[] args){

        int[] mergeTest = {4, 6, 10, 12, 1, 0, 5, 3, 15, 7};

        mergeSort(mergeTest, 0, mergeTest.length - 1);

        System.out.println(Arrays.toString(mergeTest));

    }

    public static void merge(int[] arr, int left, int middle, int right){
        //find sizes of subarrays
        int size1 = middle - left + 1;
        int size2 = right - middle;
        //create new subarrays
        int[] leftArr = new int[size1];
        int[] rightArr = new int[size2];
        //transfer data from array to subarrays
        for(int i = 0; i < size1; i++){
            leftArr[i] = arr[left + i];
        }
        for(int i = 0; i < size2; i++){
            rightArr[i] = arr[middle + 1 + i];
        }

        int i = 0, j = 0; //initial indices of subarrays
        int k = left; //initial index of merged subarray array
        //merge arrays
        while(i < size1 && j < size2){
            if(leftArr[i] <= rightArr[j]){
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        //pick up any strays

        while(i < size1){
            arr[k++] = leftArr[i++];
        }
        while(j < size2){
            arr[k++] = rightArr[j++];
        }

    }

    public static void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }
}