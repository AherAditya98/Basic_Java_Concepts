import java.util.*;
import java.util.HashSet;

public class Hashset {

    public static void subSet(String str, int idx, String newString, HashSet<String> set) {


        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }

        }
        char currChar = str.charAt(idx);
        //to be
        subSet(str, idx + 1, newString + currChar, set);
        //not to bej
        subSet(str, idx + 1, newString, set);

    }

    ;

    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subSet(str, 0, "", set);
        ;
    }

}