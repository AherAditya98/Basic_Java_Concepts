public class RecSum {
public static void sumReturn (int i,int n,int sum){
    if (i == n) {
        sum += i;
        System.out.println(sum);
        return;
    }
    sum += i;
    sumReturn(i+1, n,sum);
    System.out.println(i);

}

    public static void main (String[] args){
      sumReturn(1,5,0);
    }
}

