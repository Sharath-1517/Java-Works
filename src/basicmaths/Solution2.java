package basicmaths;

import java.util.Scanner;

public class Solution2 {

    public static boolean checkIfPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char ch : alphabet.toCharArray()) {
            if (sentence.indexOf(ch) == -1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "leetcode";
        System.out.println(checkIfPangram(s));
        sc.close();
    }
}