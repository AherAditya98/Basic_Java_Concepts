import java.util.Scanner;

public class factorial {
    public static void printFac(int n){
        //loop

        if(n<0){
            System.out.println("Invalid number");
return;
        }
        int factorial = 1;

        for(int i=n; i>= 1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

       printFac(n);

    }


}
