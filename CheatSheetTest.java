import java.util.*;

public class CheatSheetTest{

    public static void main(String[] args){

//        arrayListTest();
//
//        linkedListTest();

//        queueTest();

//        stackTest();

//        HashMap<Integer, Integer> setMap = new HashMap<>();
//
//        int[] arr = {1,2,3,4,5,6,7,8,9,1};
//
//        for(int i = 0; i < arr.length; i++){
//            setMap.put(i, arr[i]);
//        }
//
//        setMap.replace(0, 5);
//        setMap.replace(2, 3, 1000);
//        setMap.replace(3, 3, 2000);
//
//        for(Map.Entry<Integer, Integer> entry : setMap.entrySet()){
//            System.out.println(entry);
//        }

//        int[] num = {1,2,3,4};
//        StringBuilder strBuild = new StringBuilder();
//
//        for(int i = 0; i < num.length; i++){
//            strBuild.append(num[i]);
//        }
//
//        System.out.println(strBuild.toString());
//
//        int sum = Integer.parseInt(strBuild.toString()) + 1;
//        String sumStr = Integer.toString(sum);
//
//        System.out.println(sumStr.length());
//
//        int[] sumArr = new int[sumStr.length()];
//
//        for(int i = 0; i < sumArr.length; i++){
//            sumArr[i] = sumStr.charAt(i);
//        }
//
//        System.out.println(sumStr.charAt(0));
//        System.out.println(Arrays.toString(sumArr));
//
//        HashSet<String> test = new HashSet<>();
//
//        test.add("Hello" + " " + "Mary");
//        test.add("Hello Ted");
//
//        for(String s : test){
//            System.out.println(s);
//        }
//
//        System.out.println();
//
//        String[] setArr = test.toArray(new String[test.size()]);
//
//        System.out.println(setArr.length);
//
//        for(int i = 0; i < setArr.length; i++){
//            System.out.println(setArr[i]);
//        }

       Stack<Integer> myStack = new Stack<Integer>();
       int currVal = 0;

       for(int i = 0; i < 10; i++){
           myStack.push(currVal++);
       }

       System.out.println(myStack.size());




//        for(Map.Entry<Integer, Set<Integer>> entry : setMap.entrySet()){
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }


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

    public static void linkedListTest(){

        LinkedList<Integer> myLinked = new LinkedList<Integer>(Arrays.asList(1,2,3,4,5,6));

        Iterator iter = myLinked.iterator();

        myLinked.set(2, 2000);

        for(int x : myLinked){
            System.out.println(x);
        }

        System.out.println(myLinked.contains(2000));

        myLinked.offer(99);

        for(int x : myLinked){
            System.out.println(x);
        }

    }

    public static void queueTest(){

//        Queue<Integer> q = new LinkedList<Integer>();
//
//        q.offer(1);
//        q.offer(2);
//        q.offer(3);
//        q.offer(4);
//        q.offer(5);
//        q.offer(6);
//
//        while(!q.isEmpty()){
//            System.out.println(q.poll());
//        }

        Deque<Integer> q = new ArrayDeque<Integer>();

        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }



    }

    public static void stackTest(){

//        Stack<Integer> myStack = new Stack<Integer>();
        LinkedList<Integer> myStack = new LinkedList<Integer>();

        myStack.push(1);
        myStack.push(1);
        myStack.push(1);
        myStack.push(1);
        myStack.push(1);

        while(!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
    }

}