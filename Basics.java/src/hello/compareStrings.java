package hello;

public class compareStrings {
    public static void main (String args[]){
        String name1 = "Aditya";
        String name2 = "Aditya1";

//        if(name1.compareTo(name2) == 0){
//            System.out.println("String are Equal");
//
//        }else {
//            System.out.println("String not Equal");
//        }
//        if(name1 == name2){
//            System.out.println("String are Equal");
//
//        }else {
//            System.out.println("String not Equal");
//        }

        if(new String("Aditya") == new String("Aditya")){
            System.out.println("Strings are Equal");
        }else{
            System.out.println("Strings are not equal");
        }

    }
}
