package Practice;

public class Avg {
    public static void main(String [ ] args ) {
        int[] score = {55, 99, 84, 55, 66, 77,};

        int sum = 0;

    for (int ran : score ){
        sum = sum + ran;


    }
        System.out.println("The addition of this array is a "  + sum);
     System.out.println("The average of this array is a "+ sum/score.length);

    }
}
