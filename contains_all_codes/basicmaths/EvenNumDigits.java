package basicmaths;

import java.util.*;

public class EvenNumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the List: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(retevenCount(arr));
        sc.close();
    }
    static int retevenCount(int[] arr){
        int count=0;
        for (int i: arr){
            if(even(i)) count++;
        }
        return count;
    }
    static boolean even(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count % 2 == 0;
    }
}

