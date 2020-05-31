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

        SingleLinkedList singleList = new SingleLinkedList();
//        singleList.insert(singleList, 1);
//        singleList.insert(singleList, 15);
//        singleList.insert(singleList, 4);
//        singleList.printList(singleList);
//        System.out.println();
//        singleList.delete(singleList, 4);
//        singleList.printList(singleList);
//        System.out.println(singleList.size);

        singleList.insert(singleList, 1);
        singleList.insert(singleList, 15);
        singleList.insert(singleList, 4);
        singleList.insert(singleList, 8);
        singleList.insert(singleList, 5);
        singleList.insert(singleList, 11);
        singleList.insert(singleList, 10);
        singleList.insert(singleList, 9);
        singleList.insert(singleList, 2);

//        System.out.println(singleList.size);
//        System.out.println(kLast(singleList, 3));

        deleteMiddle(singleList, 5);
        singleList.printList(singleList);


    }

    public static SingleLinkedList deleteMiddle(SingleLinkedList list, int value){

        SingleLinkedList tempList = list;
        SingleLinkedList finalList = new SingleLinkedList();

        while(tempList.head.next != null){
            tempList.head = tempList.head.next;
            if(tempList.head.data != value){
                tempList.delete(tempList, tempList.head.data);
            } else if(tempList.head.data == value){
                break;
            }
        }

        finalList.insert(finalList, list.head.data);

        for(int i = 0; i < list.size - tempList.size; i++){
            list.head = list.head.next;
            finalList.insert(finalList, list.head.data);
        }

        for(int i = 0; i < tempList.size; i++){
            if(tempList.head.next != null){
                tempList.head = tempList.head.next;
                finalList.insert(finalList, tempList.head.data);
            } else {
                break;
            }
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
