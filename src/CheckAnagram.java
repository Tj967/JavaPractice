import java.util.*;

public class CheckAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("Silent", "listen"));
        System.out.println(isAnagram("Siletnt", "listen"));
    }

    public static boolean isAnagram(String s1,String s2) {
        int l1=s1.length();
        int l2=s2.length();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        Map<Character, Integer> charAppearances = new HashMap<>();

        //The logic is that if each letter appears the same amount of times, the two strings are anagrams
        //Add each letter in string 1 to a hashmap, with key as the letter and the value as the number of occurrences
        for (int i=0; i<l1; i++) {
            char c=s1.charAt(i);
            int numberOfAppearances = charAppearances.getOrDefault(c,0);
            charAppearances.put(c,numberOfAppearances+1);

        }
        //go through each letter in the second string, if there is a new letter, the strings are not anagrams
        //if the letter occurs, remove one from the counter
        for (int i=0; i<l2;i++) {
            char c = s2.charAt(i);
            if (!charAppearances.containsKey(c)) {
                return false;
            }
            charAppearances.put(c,charAppearances.get(c)-1);
        }

        //If there is any mismatch in how many times any letter appears, the two words are not anagrams
        for(int count : charAppearances.values()){
            if (count != 0) {
                return false;
            }
        }
        return true;

    }
}
