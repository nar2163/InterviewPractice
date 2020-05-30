import java.util.*;

public class LinkedListProblems{

    public static void main(String[] args){

        LinkedList<Integer> unsorted = new LinkedList<Integer>();

        unsorted.add(5);
        unsorted.add(10);
        unsorted.add(3);
        unsorted.add(5);
        unsorted.add(11);
        unsorted.add(10);

        for(int i = 0; i < unsorted.size(); i++){
            System.out.println(unsorted.get(i));
        }

        System.out.println();

        deleteDuplicates(unsorted);

        for(int i = 0; i < unsorted.size(); i++){
            System.out.println(unsorted.get(i));
        }


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
