package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {

        reverseString("Ashish".toCharArray());

    }

    public static void helper(char[] s, int left, int right) {
        if (left >= right) return;
        char tmp = s[left];
        s[left++] = s[right];
        s[right--] = tmp;
        helper(s, left, right);
    }

    public static void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }
}
