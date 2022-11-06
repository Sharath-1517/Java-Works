package BinarySearchProblems;

import java.util.*;

public class Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size :");
        int arr_size = sc.nextInt();
        System.out.print("Array Elements :");
        char[] array_of_elements = new char[arr_size];
        for (int word_count = 0; word_count < arr_size; word_count++) {
            array_of_elements[word_count] = sc.next().charAt(0);
        }
        System.out.print("Enter target value :");
        char target = sc.next().charAt(0);
        System.out.printf("The smallest letter greater that %c is %c", target, smallest_letter(array_of_elements, target));

    }


    public static char smallest_letter(char[] char_array, char target_val){
        int start=0;
        int end = char_array.length-1;
        while (start<=end){
            int mid = start + (end-start) / 2;
            if (target_val < char_array[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return char_array[start % char_array.length];
    }
}