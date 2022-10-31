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
        if(index_of_result == -1) {
            System.out.println("No target found...");
        }
        else{
            System.out.println(arr[index_of_result]);
            }
        sc.close();
    }



    public static int findCeil(int[] arr,int key){

        if (key > arr[arr.length - 1]) {
            return -1;
        }
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
