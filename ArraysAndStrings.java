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

//        System.out.println(stringRotation("erbowatttle", "erbottlewat"));
//
//        System.out.println();
//
//        int[] test = new int[10];
//        System.out.println(test.length);

//        int[] unsortedNums = {11, 1, 1, 1, 3, 4, 2};
//        System.out.println(switchedNumbers(unsortedNums));

//        String sample = "A man, a plan, a canal: Panama";
//        sample = sample.toLowerCase();
//        char[] sampleArr = new char[sample.length()];
//        int index = 0;
//
//        for(int i = 0; i < sampleArr.length; i++){
//            if(sample.charAt(i) >= 'a' && sample.charAt(i) <= 'z'){
//                sampleArr[index++] = sample.charAt(i);
//            }
//            if(sample.charAt(i) >= '0' && sample.charAt(i) <= '9'){
//                sampleArr[index++] = sample.charAt(i);
//            }
//        }

//        String s = "b..s";
//        int count = 0;
//
//        if(s.contains(".")) {
//
//            for(int i = 0; i < s.length(); i++){
//                if(s.charAt(i) == '.'){
//                    count++;
//                }
//            }
//            System.out.println(count);
//            String[] sampleArr = s.split("\\W");
//
//
//            for (int i = 0; i < sampleArr.length; i++) {
//                if (sampleArr[i] != null) {
//                    s = sampleArr[i];
//                }
//            }
//        }
//
//        System.out.println(s);

//        int[][] test = {{1, 2}, {3, 4}, {5, 6}, {1, 7}, {1, 4}, {3, 1}};
//        HashMap<Integer, HashSet<Integer>> testMap = new HashMap<>();
//
//        for(int[] x : test){
//            HashSet<Integer> temp = new HashSet<Integer>();
//            if(!testMap.containsKey(x[0])){
//                temp.add(x[1]);
//                testMap.put(x[0], temp);
//            } else {
//                temp = testMap.get(x[0]);
//                temp.add(x[1]);
//                testMap.put(x[0], temp);
//            }
//        }
//
//        for(Map.Entry<Integer, HashSet<Integer>> entry : testMap.entrySet()){
//            System.out.print("Key: " + entry.getKey() + " Values: ");
//            for(Integer x : entry.getValue()){
//                System.out.print(x + " ");
//            }
//            System.out.println();
//        }

//        ArrayList<Integer> arrList = new ArrayList<>();
//
//        arrList.add(1);
//        arrList.add(2);
//
//        for(int x : arrList){
//            System.out.println(x);
//        }
//
//        StringBuilder s = new StringBuilder();
//        s.append("Hello My Name Is       ");
//
//        System.out.println(s.toString());
//        s.insert(0, 'x');
//        System.out.println(s);
//        String s = new String();
//        s = "super CAtman";
//        s = s.toLowerCase();
//        for(char c : s.toCharArray()){
//            System.out.print(c);
//        }
//
//        int x = 5;
//
//        String num = "12345";
//        int numS = Integer.parseInt(num);
//        System.out.println(numS + 1);
//
//        int[] arr = {9, 3, 6, 10, 27, 4};
        int[][] arr2 = {{1,2},{3,4},{6,7},{4,5},{0, 1}};
        Arrays.sort(arr2);

        for(int i = 0; i < arr2.length; i++){
            int[] curr = arr2[i];
            System.out.println(Arrays.toString(arr2));
        }
//        for(int row = 0; row < arr2.length; row++){
//            for(int col = 0; col < arr2[row].length; col++){
//                System.out.print(arr2[row][col]);
//            }
//            System.out.println();
//        }
//        Arrays.sort(arr);
//        System.out.println(Arrays.binarySearch(arr, 3));
//        System.out.println(Arrays.toString(arr));

//        if(curr.contains(anyWord) && curr.length() == word.length()){
//            for(int i = 0; i < curr.length(); i++){
//                if(curr.charAt(i) != word.charAt(i) && word.charAt(i) != '.'){
//                    continue;
//                }
//                if(i == curr.length() - 1){
//                    return true;
//                }
//            }
//        }

    }

    public static int switchedNumbers(int[] unsorted){
//        int[] sorted = new int[unsorted.length];
//
//        for(int i = 0; i < unsorted.length; i++){
//            sorted[i] = unsorted[i];
//        }
//
//        Arrays.sort(sorted);
//
//        int lastMoved = Integer.MAX_VALUE;
//        int j = 0, count = 0;
//
//        for(int i = 0; j < sorted.length - count; i++){
//            if(unsorted[i] != sorted[j] && unsorted[i] != lastMoved){
//                lastMoved = sorted[j];
//                count++;
//                i--;
//            }
//
//            j++;
//        }

        LinkedList<Integer> myStack = new LinkedList<Integer>();
        int count = 0, i = 0;

        if(unsorted.length >= 2 && unsorted[0] > unsorted[1]){
            count++;
            i = 1;
        }

        for( ; i < unsorted.length; i++){
            if(!myStack.isEmpty() && myStack.peek() > unsorted[i]){
                count++;
            } else {
                myStack.push(unsorted[i]);
            }

        }

        return count;
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