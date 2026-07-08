package NEXT_CHAPTER;

public class Array_reverse_print {

//        public static void main(String[] args) {
//            String[] Names = {"Ruturaj ", "Shahu", "Deshmukh"};
//            for (int i =2; i <Names.length; i--) {
//                System.out.println(Names[i]);
//            }
//        }
//    }


    public static void main(String[] args) {
        String[] Names = {"Ruturaj ", "Shahu", "Deshmukh"};
        for (int i =Names.length-1; i>=0; i--) {
            System.out.println(Names[i]);
        }
    }
}