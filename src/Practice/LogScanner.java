package Practice;

//public class R {

    public class LogScanner {
        public static void main(String[] args) {


            int[] serverLogs = {200, 200, 401, 200, 500, 404};


            for (int i = 0; i < serverLogs.length; i++) {


     if (serverLogs [i]== 404 ){
         System.out.println("Error 404 found!");
         break;
     }else {
         System.out.println("Not Found ");
     }

            }
        }
    }

