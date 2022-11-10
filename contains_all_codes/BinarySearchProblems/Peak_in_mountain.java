package BinarySearchProblems;


// This program will find the first index element of the target value instances.
// If arr = {1,2,3,4,5,3,1} and target = 3. The answer will be index number '2'.
// Play with this code using your own use cases.

public class Peak_in_mountain {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,3,1,2,3,4,};
        int target = 4;

        System.out.printf("The element index is %d", orderAgnosticBS(arr, target));

    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = binarySearch_for_end_value(arr);

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }


    public static int binarySearch_for_end_value(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid+1]) {

                end = mid;

            } else {

                start = mid + 1;

            }
        }
        return end;
    }
}