package Recursion;

public class EX2 {

    public static boolean isSorted(int[] arr, int index) {

        // 1. Base Case
        // if we go toward last element return true .
        if (index == arr.length - 1) {
            return true;
        }

       //  false
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // 3. Recursive Call

        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7,5};

        // find from 0 index
        boolean result = isSorted(arr, 0);

        if (result) {
            System.out.println("Array सॉर्टेड आहे!");
        } else {
            System.out.println("Array सॉर्टेड नाही!");
        }
    }
}