package NEW_CHAPTER1;
import java .util.Arrays ;
public class _2DArray_ {

    public static void main (String [] args ){

        int [] [] mat1 = {{1,2,3},
                          {4,5,6 }};
        int [] [] mat2 = {{9,8,7},
                           {6,5,4}};
        System.out.println("printing the array 1" );
        System.out.println(Arrays.deepToString(mat1) );

        System.out.println("printing the array 2");
        System.out.println(Arrays.deepToString(mat2));

    }
}
