package Practice;

public class R2 {
   // public class MaxFinder {
        public static void main(String[] args) {

            // Response times in milliseconds
            int[] responseTimes = {120, 340, 800, 210, 90};

            // 1. Assume the first one is the biggest to start
            int maxTime = responseTimes[0];

            // 2. Loop through the array (We can start at index 1, since we already looked at 0!)
            for (int i = 1; i < responseTimes.length; i++) {

                // YOUR TURN:
                if (responseTimes[i]>maxTime){
                    maxTime=responseTimes[i];
                }
                // Write an 'if' statement checking if the current item ( responseTimes[i] )
                // is GREATER than your current 'maxTime'.
                // If it is, update maxTime to equal responseTimes[i].


            }

            // 3. Print the final result
            System.out.println("The slowest database query took: " + maxTime + "ms");
        }
    }

