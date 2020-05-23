import java.util.*;

public class ArraysAndStrings{

    public static void main(String[] args){

//        System.out.println(uniqueChar("Green"));
//        System.out.println(uniqueChar("egGs"));
//        System.out.println(uniqueChar("car"));
//        System.out.println(uniqueChar("ham"));

        System.out.println(isPerm("car", "arc"));
        System.out.println(isPerm("far", "wide"));
        System.out.println(isPerm("bus", "bus"));

    }

    public static boolean uniqueChar(String word){
        //brute force N^2
//        String temp = word.toLowerCase();
//        word.toLowerCase();
//
//        for(int i = 0; i < word.length() - 1; i++){
//            for(int j = 0; j < word.length() - 1; j++){
//                if(temp.charAt(i) == word.charAt(j) && i != j){
//                    return false;
//                }
//            }
//        }
//
//        return true;

        // HashMap: N

        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        word = word.toLowerCase();
        int count = 0;

        for(int i = 0; i < word.length() - 1; i++){
            if(!letters.containsKey(word.charAt(i))){
                letters.put(word.charAt(i), 1);
            } else if(letters.containsKey(word.charAt(i))){
                count = letters.get(word.charAt(i));
                letters.put(word.charAt(i), ++count);
            }
        }

        for(Map.Entry entry : letters.entrySet()){
            Integer val = (Integer) entry.getValue();
            if(val > 1){
                return false;
            }
        }

        return true;
    }

    public static boolean isPerm(String word1, String word2) {
        //brute force N^2
//
//        if(word1.length() != word2.length()){
//            return false;
//        }
//
//        boolean soFar = false;
//
//        for(int i = 0; i < word1.length(); i++) {
//            for(int j = 0; j < word1.length(); j++){
//                if(word1.charAt(i) == word2.charAt(j)){
//                    soFar = true;
//                }
//            }
//        }
//

//
//        if(soFar == true){
//            return true;
//        } else {
//            return false;
//        }
//    }

        // N

        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        boolean isPerm = false;

        for (int i = 0; i < word1.length(); i++) {
            letters.put(word1.charAt(i), i);
        }

        for (int i = 0; i < word1.length(); i++) {
            if (letters.containsKey(word2.charAt(i))) {
                isPerm = true;
            } else {
                isPerm = false;
            }
        }

        return isPerm;
    }
}