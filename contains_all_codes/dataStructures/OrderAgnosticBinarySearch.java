package dataStructures;

import java.util.Scanner;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the values of the list :");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the search element: ");
        int n = sc.nextInt();
        if(isAsc(arr)) {
            System.out.println("Ascending Order List...");
            System.out.println(AscBinarySearch(arr, n));
        }
        else {
            System.out.println("Descending Order List...");
            System.out.println(DescBinarySearch(arr, n));
        }
        sc.close();
    }

    static boolean isAsc(int[] arr){
        return arr[0] <= arr.length - 1;
    }

    static int DescBinarySearch(int[] arr,int key){
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start) / 2;
            if (key < arr[mid]) {
                start = mid + 1;
            }
            else if (key > arr[mid]) {
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    static int AscBinarySearch(int[] arr,int key){
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
        return -1;
    }
}
