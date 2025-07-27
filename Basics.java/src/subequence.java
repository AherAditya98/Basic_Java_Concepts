public class subequence {

    public static void subSeq(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be
        subSeq(str, idx + 1, newString + currChar);
        //not to be
        subSeq(str, idx + 1, newString);

    }

    public static void main(String[] args) {
        String str = "aaa";
        subSeq(str, 0, " ");
    }
}