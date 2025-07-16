import java.util.*;
public class SumNumbers {
    public static int calSum(int a,int b){
        return a * b;
    }

    public static void main (String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int sum = calSum(a,b);
        System.out.println(calSum(a,b));
    }}
