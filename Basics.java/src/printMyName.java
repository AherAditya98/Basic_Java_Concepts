import java.util.Scanner;

public class printMyName {
    public static void namePrint(String name){
        System.out.println(name);
        return;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        namePrint(name);
    }
}
