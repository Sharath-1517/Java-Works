public class PatternProblems {
    public static void main(String[] args) {
            int n = 5;
            pattern1(n);
            pattern2(n);
            pattern3(n);
    }

   public static void pattern1(int n){

        for (int i = 1; i <= n ; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n){
        for (int row = 0; row < 2*n ; row++) {
            int totalrows = row > n ? 2 * n - row : row ;
            for (int col = 0; col < totalrows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//    public static void pattern4(int n){
//        for (int row = 1; row <= n ; row++) {
//            for (int col = 0; col < ; col++) {
//
//            }
//        }
//    }
}