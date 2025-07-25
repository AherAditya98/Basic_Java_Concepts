public class Sorting {
//public static void printArray(int[] arr){
//    for (int i=0; i<arr.length;i++){
//        System.out.println(arr[i] + " ");
//    }
//
//}
//public static void main (String[] args ){
//    //Bubble Sorting [ 7,8,3,1,2]
//    int arr[] = {7,8,3,1,2};
//
//    for(int i=0;i<arr.length-1;i++){
//        for(int j=0; j<arr.length-i-1;j++){
//            if(arr[j] > arr[j+1]){
//                //swop
//                int temp = arr[j];
//                arr[j]= arr[j+1];
//                arr[j+1] = temp;
//            }
//        }
//    }
//    printArray(arr);
//}

    //Selection Sort
    public static void printArray(int[] arr){
    for (int i=0; i<arr.length;i++){
        System.out.print(arr[i] + " ");
    }

}


  public static void main(String[] args){
     int[] arr = {4,2,5,6,9,1};

     for (int i=0; i<arr.length;i++){
          int current = arr[i];
          int j = i-1;
          while(j >= 0 && current < arr[j]){
              arr[j+1] =arr[j];
              j--;
          }
          arr[j+1] = current;
     }
     printArray(arr);

  }

}
