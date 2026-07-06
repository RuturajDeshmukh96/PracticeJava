package NEXT_CHAPTER;

public class To {

    public static void main(String[] args) {
        int[] prices = {5, 12, 3, 8, 2};
        int sum = 0;

        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }

        System.out.println("The total sum is: " + sum);
    }
}

// the java