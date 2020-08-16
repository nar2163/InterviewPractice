import java.util.*;

public class CheatSheetTest{

    public static void main(String[] args){

        arrayListTest();

    }

    public static void arrayListTest(){

        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);
        arrList.add(1, 0);

        Object[] arr = arrList.toArray();

        System.out.println(Arrays.toString(arr));

        ArrayList<ArrayList<Integer>> arrList2 = new ArrayList<>();
        ArrayList<Integer> internal = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> internal2 = new ArrayList<>(Arrays.asList(7,8,9,10));
        arrList2.add(internal);
        arrList2.add(internal2);

        Object[] arr2 = arrList2.toArray();

        System.out.println(Arrays.toString(arr2));

    }

}