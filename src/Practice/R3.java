package Practice;

public class R3 {
  //  public class BinarySearcher {
        public static void main(String[] args) {

            // 1. Our sorted database
            int[] orderIds = {101, 205, 399, 410, 550, 680, 720};
            int target = 550; // The order we want

            // 2. Our sticky notes (Left side and Right side)
            int left = 0;
            int right = orderIds.length - 1;

            // 3. Keep searching as long as the left and right haven't crossed
            while (left <= right) {

                // Find the exact middle index
                int mid = (left + right) / 2;

                // YOUR TURN:
                if (orderIds[mid] ==  target){
                    System.out.println("Found at index" + mid );
                    break;
                }
                // Write an 'if' statement checking if orderIds[mid] is exactly equal to the target.
                // If it is, print "Found the order at index: " + mid
                // Then write 'break;' to stop the loop.


            }

    }


}
