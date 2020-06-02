import java.util.*;

public class LinkedListProblems{

    public static void main(String[] args){

//        LinkedList<Integer> unsorted = new LinkedList<Integer>();
//
//        unsorted.add(5);
//        unsorted.add(10);
//        unsorted.add(3);
//        unsorted.add(5);
//        unsorted.add(11);
//        unsorted.add(10);
//
//        for(int i = 0; i < unsorted.size(); i++){
//            System.out.println(unsorted.get(i));
//        }
//
//        System.out.println();
//
//        deleteDuplicates(unsorted);
//
//        for(int i = 0; i < unsorted.size(); i++){
//            System.out.println(unsorted.get(i));
//        }

//        SingleLinkedList singleList = new SingleLinkedList();
//        singleList.insert(singleList, 1);
//        singleList.insert(singleList, 15);
//        singleList.insert(singleList, 4);
//        singleList.printList(singleList);
//        System.out.println();
//        singleList.delete(singleList, 4);
//        singleList.printList(singleList);
//        System.out.println(singleList.size);

//        singleList.insert(singleList, 1);
//        singleList.insert(singleList, 15);
//        singleList.insert(singleList, 4);
//        singleList.insert(singleList, 8);
//        singleList.insert(singleList, 5);
//        singleList.insert(singleList, 11);
//        singleList.insert(singleList, 10);
//        singleList.insert(singleList, 9);
//        singleList.insert(singleList, 2);

//        System.out.println(singleList.size);
//        System.out.println(kLast(singleList, 3));

//        singleList = partitionList(singleList, 8);
//        singleList.printList(singleList);

//        SingleLinkedList firstNumber = new SingleLinkedList();
//        SingleLinkedList secondNumber = new SingleLinkedList();
//        SingleLinkedList sumNumber = new SingleLinkedList();
//
//        firstNumber.insert(firstNumber, 2);
//        firstNumber.insert(firstNumber, 6);
//        firstNumber.insert(firstNumber, 4);
//        secondNumber.insert(secondNumber, 5);
//        secondNumber.insert(secondNumber, 3);
//        secondNumber.insert(secondNumber, 2);
//
//        firstNumber.printList(firstNumber);
//        System.out.println();
//        secondNumber.printList(secondNumber);
//        System.out.println();
//        sumNumber = addReverseOrder(firstNumber, secondNumber);
//        sumNumber.printList(sumNumber);

        SingleLinkedList palTest = new SingleLinkedList();

        palTest.insert(1);
        palTest.insert(2);
        palTest.insert(3);
        palTest.insert(4);
        palTest.insert(4);
        palTest.insert(8);
        palTest.insert(4);
        palTest.insert(3);
        palTest.insert(2);
        palTest.insert(1);

        System.out.println();

        palTest.delete(8);

        palTest.printList();
    }

    public static boolean isPalindrome(SingleLinkedList list){

        return true;

    }

    public static SingleLinkedList addReverseOrder(SingleLinkedList list1, SingleLinkedList list2){

        int one1, one2, ten1, ten2, hundred1, hundred2, sum;
        SingleLinkedList sumList = new SingleLinkedList();

        one1 = list1.head.data;
        one2 = list2.head.data;

        list1.head = list1.head.next;
        list2.head = list2.head.next;

        ten1 = list1.head.data * 10;
        ten2 = list2.head.data * 10;

        list1.head = list1.head.next;
        list2.head = list2.head.next;

        hundred1 = list1.head.data * 100;
        hundred2 = list2.head.data * 100;

        sum = one1 + one2 + ten1 + ten2 + hundred1 + hundred2;

        if((ten1 + ten2) / 10 == 10){
            sumList.insert(((hundred1 + hundred2) / 100) + 1);
        } else {
            sumList.insert((hundred1 + hundred2) / 100);
        }

        if(sum % 10 == 0 && (ten1 + ten2) / 10 != 10){
            sumList.insert(((ten1 + ten2) / 10) + 1);
        } else if((ten1 + ten2) / 10 == 10) {
            sumList.insert(0);
        } else {
            sumList.insert((ten1 + ten2) / 10);
        }

        sumList.insert(sum % 10);

        return sumList;

    }

    public static SingleLinkedList partitionList(SingleLinkedList list, int k){

        SingleLinkedList tempList = list;
        SingleLinkedList lessThan = new SingleLinkedList();
        SingleLinkedList equals = new SingleLinkedList();
        SingleLinkedList greaterThan = new SingleLinkedList();
        SingleLinkedList finalList = new SingleLinkedList();

        while(tempList.head != null){
            if(tempList.head.data < k){
                lessThan.insert(tempList.head.data);
            } else if(tempList.head.data == k){
                equals.insert(tempList.head.data);
            } else if(tempList.head.data > k){
                greaterThan.insert(tempList.head.data);
            }

            tempList.head = tempList.head.next;
        }

       while(lessThan.head != null){
           finalList.insert(lessThan.head.data);
           lessThan.head = lessThan.head.next;
       }

       while(equals.head != null){
           finalList.insert(equals.head.data);
           equals.head = equals.head.next;
       }

       while(greaterThan.head != null){
           finalList.insert(greaterThan.head.data);
           greaterThan.head = greaterThan.head.next;
       }

        return finalList;

    }

    public static int kLast(SingleLinkedList list, int k){

       SingleLinkedList kLast = list;

        for(int i = 0; i < list.size - k; i++){
            kLast.head = kLast.head.next;
        }

        return kLast.head.data;
    }

    public static void deleteDuplicates(LinkedList<Integer> list){

        if(list == null){
            return;
        }

//        int prev = list.getFirst();
//
//        for(int i = 1; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(j) == prev) {
//                    list.remove(j);
//                }
//            }
//
//            prev = list.get(i);
//        }

        Hashtable<Integer, Integer> values = new Hashtable<Integer, Integer>();

        for(int i = 0; i < list.size(); i++){
            if(!values.containsKey(list.get(i))){
                values.put(list.get(i), 1);
            } else if(values.containsKey(list.get(i))){
                values.put(list.get(i), values.get(list.get(i)) + 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = values.entrySet();

        for(Map.Entry<Integer, Integer> entry : entries){
            if(entry.getValue() > 1){
                list.remove(entry.getKey());
                values.put(entry.getKey(), entry.getValue() - 1);
            }
        }
    }


}
