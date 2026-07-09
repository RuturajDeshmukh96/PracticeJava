package NEW_CHAPTER1;

public class Array_2D {
    public static void main (String [] args ){

        int [] [] flats ;
        flats = new int [2] [3];

        flats [0] [0] = 001;
        flats  [0] [1] = 002;
        flats  [0] [2] = 003;

        flats [1] [0] = 101;
        flats  [1] [1] = 102;
        flats  [1] [2]= 103;

        for (int [ ] row : flats ){
            for (int  element : row ){
                System.out.print(element+ "  ");
            }
            System.out.println();
        }


    }
}
