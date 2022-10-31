package BinarySearchProblems;
import java.util.*;


public class Floor_of_an_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        int index_of_result = findCeil(arr,target);
        System.out.println(arr[index_of_result]);
    }
    public static int findCeil(int[] arr,int key){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start) / 2;
            if (key < arr[mid]) {
                end = mid - 1;
            }
            else if (key > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;
    }

}
