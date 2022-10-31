package basicmaths;

import java.util.*;

public class AccountWealth{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row and col: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(maxWealth(arr));
        sc.close();
    }

    static int maxWealth(int[][] arr){
        int sum = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int temp=0;
            for (int j=0;j<arr[0].length;j++){
                temp+=arr[i][j];
            }
            sum=Math.max(temp,sum);
        }
        return  sum;
    }
}