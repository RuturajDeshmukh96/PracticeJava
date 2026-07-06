package NEXT_CHAPTER;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {11, 24, 37, 42, 56, 73};
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}


