import java.util.Scanner;

public class TwoDArrays {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();;
        int column = sc.nextInt();

        int[][] numbers = new int[rows][column];
        //rows
        for (int i=0; i<rows; i++){
            //columns
            for (int j=0;j<column; j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        int x = sc.nextInt();
        //output
        for (int i=0;i<rows;i++){
           for (int j=0;j<column;j++){
               if (numbers[i][j] == x ){
                   System.out.println("x found at location :" + i +", " + j + ")");
               };
           }
            System.out.println();
        }
    }
}

