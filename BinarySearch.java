public class BinarySearch{

    public static void main(String[] args){

        int[] testArr = {1,2,3,4,5,6,7};

        int index = binarySearch(testArr, 0, testArr.length, 3);

        System.out.println(index);


    }

    public static int binarySearch(int[] arr, int low, int high, int target){
        int mid = (low + high) / 2;

        if(high >= 1) {
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                return binarySearch(arr, low, mid - 1, target);
            }

            return binarySearch(arr, mid + 1, high, target);

        }

        return -1;
    }
}