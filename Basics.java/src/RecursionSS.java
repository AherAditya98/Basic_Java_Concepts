public class RecursionSS {

    public static int calculatefac(int n ){
        if (n==0 || n==1){
            return 1;
        }
        int fac_1 = calculatefac(n-1);
        int fac_2 = n*fac_1;
        return fac_2;
    };

    public static void main (String[] args) {
        int n = 5;
        int ans = calculatefac(n);
        System.out.println(ans);

    }
}

