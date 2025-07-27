public class KeyPad {
    public static String[] keyPad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombiation(String str, int idx, String combination) {
        if (idx == str.length()){
            System.out.println(combination);
            return;
        }
        char cuuChar = str.charAt(idx);
        String mapping = keyPad[cuuChar-'0'];
        for (int i=0;i<mapping.length();i++){
            printCombiation(str,idx+1,combination+mapping.charAt(i));

        }

    }

    public static void main(String[] args) {
    String str = "32";
    printCombiation(str,0, "");
    }
}
