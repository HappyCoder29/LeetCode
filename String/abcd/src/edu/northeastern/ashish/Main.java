package edu.northeastern.ashish;

public class Main {

    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        int[] square = squareArray(arr);
        System.out.println();

    }


    public static int[] squareArray(int[] array){

        int[] result = new int[ array.length];
        int start = 0;
        int end = array.length - 1;

        for (int i = array.length - 1; i >= 0; i--) {
            int square;
            if (Math.abs(array[start]) < Math.abs(array[end])) {
                square = array[end];
                end--;
            } else {
                square = array[start];
                start++;
            }
            result[i] = square * square;
        }
        return result;
    } //End of squareArray function
}
