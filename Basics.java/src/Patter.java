public class Patter {

    public static void main(String[] args) {
// 4 Stars
//        int n = 4;
//        int m = 5;
//
//        //outer loop
//         for(int i=1; i<=n; i++){
//             //inner loop
//             for(int j=1; j<=m;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//
//         }
//    }

// Hollow Rectangle
//        int n = 4;
//        int m = 5;
//
//        for(int i =1;i <=n;i++){
//            for(int j =1;j<=m;j++){
//                if(i==1 || j==1 || i==n ||j==m){
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//
//        }
//        int n = 4;
//
//        for(int i=1; i<=n; i++){
//            for (int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int n = 5;


        for (int i=1; i<=n;i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n-1);
            for(int j = 1;j <=spaces;j++) {
                System.out.print(" ");
            }
            //2nd Part
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lowerhalf

        for (int i=n; i>=1; i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2 * (n-1);
            for(int j = 1; j<=spaces;j++) {
                System.out.print(" ");
            }
            //2nd Part
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }






    }


}
