import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class pattern {
    public static void main(String[] args) {

        int n =4;
        int m =5;
        //outer loop
        for (int i =1;i<=n;i++) {
            for (int j=1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
