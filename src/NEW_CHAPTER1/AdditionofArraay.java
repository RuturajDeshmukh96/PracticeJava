package NEW_CHAPTER1;

public class AdditionofArraay {
    public static void main (String [] args ){

        float[] marks = {44.0f,45.9f,89.4f,94.5f,69.9f};
        float sum = 0 ;

        for (float rum : marks){
            sum = sum + rum ;
        }
            System.out.println("The sum of this array is the : " +  sum);

         System.out.println("the averge og this arraay is " + sum/marks.length);
        }
    }

