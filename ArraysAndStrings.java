import java.util.*;

public class ArraysAndStrings{

    public static void main(String[] args){

//        System.out.println(uniqueChar("Green"));
//        System.out.println(uniqueChar("egGs"));
//        System.out.println(uniqueChar("car"));
//        System.out.println(uniqueChar("ham"));

//        System.out.println(isPerm("car", "arc"));
//        System.out.println(isPerm("far", "wide"));
//        System.out.println(isPerm("bus", "bus"));

//        System.out.println(urlify("Mr John Smith", 13));
//        System.out.println(urlify("nicrockwood .com", 15));
//        System.out.println(urlify("www.google.com", 14));

//        System.out.println(palindromePerm("Tact Coa"));
//        System.out.println(palindromePerm("abcdsef"));
//        System.out.println(palindromePerm("ababa"));
//        System.out.println(palindromePerm("ababac"));
//        System.out.println(palindromePerm("acb bca"));

//        System.out.println(countEditNumber("pale", "ple"));
//        System.out.println(countEditNumber("pales", "pale"));
//        System.out.println(countEditNumber("pale", "bale"));
//        System.out.println(countEditNumber("pale", "bake"));
//        System.out.println(countEditNumber("p", "pale"));

//        System.out.println(compressString("aabccccaa"));
//        System.out.println(compressString("b"));
//        System.out.println(compressString("abcdefg"));
//        System.out.println(compressString("fffffffffff"));

//        int[][] image = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
//        printImage(image);
//        System.out.println();
//        rotateImage(image);

//        int[][] zeroArray = { {1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
//        isZero(zeroArray);
//        printImage(zeroArray);

        System.out.println(stringRotation("erbowatttle", "erbottlewat"));

    }

    public static boolean stringRotation(String word1, String word2){

        int startIndex = 0, endIndex = 0;

        if(word1.length() != word2.length()){
            return false;
        }

        for(int i = 0; i < word1.length(); i++){
            for(int j = 0; j < word2.length(); j++){
                if(startIndex == 0 && word1.charAt(i) == word2.charAt(j)){
                    startIndex = j;
                } else if(startIndex != 0 && word1.charAt(i) == word2.charAt(j)){
                    endIndex = j;
                }
            }
        }

        return isSubString(word1, word2, startIndex, endIndex);

    }

    public static boolean isSubString(String word1, String word2, int startIndex, int endIndex){

        String sub = word2.substring(startIndex, endIndex);

        return word1.contains(sub);
    }

    public static void isZero(int[][] array){

        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                if(array[row][col] == 0){
                    zeroOutRowCol(array, row, col);
                    return;
                }
            }
        }

    }

    public static void zeroOutRowCol(int[][] array, int row, int col){

        for(int zeroCol = 0; zeroCol < array[row].length; zeroCol++){
            array[row][zeroCol] = 0;
        }

        for(int zeroRow = 0; zeroRow < array.length; zeroRow++){
            array[zeroRow][col] = 0;
        }

    }

    public static void rotateImage(int[][] array){

        int temp = 0;

        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                temp = array[row][col];
                array[row][col] = array[row][array[row].length - 1];
                array[row][array[row].length- 1] = temp;
            }
        }

        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                temp = array[row][col];
                array[row][col] = array[col][row];
                array[col][row] = temp;
            }
        }

        printImage(array);

    }

    public static void printImage(int[][] array){

        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[row].length; col++){
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }

    }

    public static String compressString(String word){

        StringBuilder compressedWord = new StringBuilder();
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();

        for(int i = 0; i < word.length(); i++){
            if(!letters.containsKey(word.charAt(i))){
                letters.put(word.charAt(i), 1);
            } else if(letters.containsKey(word.charAt(i))){
                letters.put(word.charAt(i), letters.get(word.charAt(i)) + 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = letters.entrySet();

        for(Map.Entry<Character, Integer> entry : entries){
            compressedWord.append(entry.getKey());
            compressedWord.append(entry.getValue().toString());
        }

        return compressedWord.toString();
    }

    public static boolean countEditNumber(String word1, String word2){

        if(word1.equals(word2)){
            return true;
        }

        if(charCountCheck(word1, word2) && characterDiffCountCheck(word1,word2)){
                return true;
        }

        return false;

    }

    public static boolean charCountCheck(String word1, String word2){
        if(Math.abs(word1.length() - word2.length()) > 1){
            return false;
        }

        return true;
    }

    public static boolean characterDiffCountCheck(String word1, String word2){

        Hashtable<Character, Integer> letters = new Hashtable<Character, Integer>();
        int count = 0;

        for(int i = 0; i < word1.length(); i++){
            if(!letters.containsKey(word1.charAt(i))){
                letters.put(word1.charAt(i), 1);
            } else if(letters.containsKey(word1.charAt(i))) {
                letters.put(word1.charAt(i), letters.get(word1.charAt(i)) + 1);
            }
        }

        for(int i = 0; i < word2.length(); i++){
            if(!letters.containsKey(word2.charAt(i))){
                count++;
            }
        }

        if(count > 1){
            return false;
        }

        return true;
    }

    public static boolean palindromePerm(String word){
        word = word.toLowerCase();
        Hashtable<Character, Integer> letters = new Hashtable<Character, Integer>();
        boolean perm = false;
        int tracker = 0;

        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == ' '){
                continue;
            }
            if(!letters.containsKey(word.charAt(i))){
                letters.put(word.charAt(i), 1);
            } else {
                letters.replace(word.charAt(i), letters.get(word.charAt(i)) + 1);
            }
        }

        Set<Character> keys = letters.keySet();

        for(Character c : keys){
            if(letters.get(c) % 2 == 0) {
                perm = true;
            } else if(letters.get(c) % 2 != 0){
                tracker++;
            }
        }

        if(tracker > 1){
            perm = false;
        }

        return perm;

    }

    public static String urlify(String url, int length){

        StringBuilder urlify = new StringBuilder();

        for(int i  = 0; i < url.length(); i++){
            if(url.charAt(i) == ' '){
                urlify.append("%20");
            } else {
                urlify.append(url.charAt(i));
            }
        }

        return urlify.toString();
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