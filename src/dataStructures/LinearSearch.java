package dataStructures;
import java.util.*;

public class LinearSearch {

    static boolean linearSearch(int[] arr,int searchKey){
        if (arr.length==0) return false;
        for (int j : arr) {
            if (searchKey == j) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array and Search key value: ");
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the values of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(linearSearch(arr, s)) System.out.println("Element exists...");
        sc.close();
    }
}
