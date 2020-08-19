import java.util.*;

public class QuickSort{


    public static void main(String[] args){

        int[] arr = {4, 8, 1, 5, 7, 0, 3, 2};

        sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));


    }

    public static void QuickSort(int[] arr, int low, int high){

        if(low < high){
            int partIndex = partition(arr, low, high);
            sort(arr, low, partIndex - 1);
            sort(arr, partIndex + 1, high);
        }

    }

    public static int partition(int[] arr, int low, int high){

        //make partition last value in array
        int pivotVal = arr[high];
        int slow = low - 1;

        //swap values until fast reaches the end of subarray
        for(int fast = low; fast < high; fast++){
            if(arr[fast] < pivotVal){
                slow++;
                int temp = arr[slow];
                arr[slow] = arr[fast];
                arr[fast] = temp;
            }
        }

        //place partition in the middle-ish
        int temp = arr[slow + 1];
        arr[slow + 1] = arr[high];
        arr[high] = temp;

        //return new partition index
        return slow + 1;
    }
}