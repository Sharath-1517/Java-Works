package BinarySearchProblems;

// NOTE : THE ALREADY DECLARED i.e THE FIXED ARRAY SIZE WONT WORK.

public class Sorted_infinite_array {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int target = 13;

        int value = ans(array, target);

        if(value != -1) System.out.printf("The target element is found at index :%d", value);
        else System.out.println("Target element not found");
    }

    public static int ans(int[] array, int target){

        int start = 0;
        int end = 1;
        while (target > array[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return Binary_search(array, target, start, end);
    }

    public static int Binary_search(int[] array, int target, int start, int end){

        while(start <= end)
        {
            int mid = start + (end - start) / 2;

            if (array[mid] < target) start = mid + 1;
            else if (array[mid] > target) end = mid - 1;
            else return mid;
        }

        return -1;
    }
}
