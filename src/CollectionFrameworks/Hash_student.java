package CollectionFrameworks;
import java.util.HashMap;
public class Hash_student {
    String studname ;
    int studage ;
    float studmarks ;


    public Hash_student ( String studname , int studage , float studmarks ) {
        this. studname = studname ;
        this.studage = studage ;
        this.studmarks = studmarks  ;

    }
    public void show (){
        System.out .println("Name : " + studname + " " +"age : " +  studage +" " + "marks : " + studmarks );
}
}
class db  {
    public static void main (String [] args ){
        HashMap < Integer ,Hash_student > studinfo = new HashMap <> ();

      Hash_student s1 = new Hash_student   ( "Rutu",26,89.0f);
      Hash_student s2 = new Hash_student   ( "Rajesh",26,89.0f);
      Hash_student s3 = new Hash_student   ( "Nagesh",26,89.0f);

        studinfo.put(101,s1);
        studinfo.put(102,s2);
        studinfo.put(103,s3);

        studinfo.put(104,new Hash_student("dj",23,20.0f));

        Hash_student hash = studinfo.get(104);
           hash.show();


        for (Integer rollNo : studinfo.keySet()) {

            System.out.print("Roll no : " + rollNo + " -> ");


            Hash_student studentData = studinfo.get(rollNo);


            studentData.show();
        }
    }
    }
