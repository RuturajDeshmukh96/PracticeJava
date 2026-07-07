package NEXT_CHAPTER;

public class New {


        public static void main(String[] args) {
            int[] items = {101, 204, 305, 402, 509};
            int target = 400;
            int foundIndex = -1;

            for (int i = 0; i < items.length; i++) {
                if (items[i] == target) {
                    foundIndex = i;
                    break;
                }
            }

            if (foundIndex != -1) {
                System.out.println("Found " + target + " at index: " + foundIndex);
            } else {
                System.out.println(target + " is not in this array.");
            }
        }
    }

