package VarArgs;

public class vararg {

    public static void Rub(int...price ) {
        System.out.println("this is printing the vararg example ");

        int total = 0;

        for (int p : price) {
            total = total + p;
            System.out.println(price.length + total);
        }
    }

public static void main (String [] raaj ){

        Rub(12);

        Rub (45);

  Rub(11,22,33,55,66,77,8);
  Rub (9,90,86,7,8,6,5);
        }


}
