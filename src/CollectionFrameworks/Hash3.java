package CollectionFrameworks;
import java.util.HashMap;
public class Hash3 {
    protected  String name ;
     protected  int age ;
    public Hash3 (String  name , int age) {
        this.name = name ;
        this.age = age ;
        System.out.println("The Name of Stud is : "+ name +"\n"+ "The age of stud is : "+ age );

    }
}
class Hush {
    public static void main(String [] args ){
        HashMap<Integer ,Hash3> info = new HashMap<> ();
        Hash3 h1 = new Hash3("Ruturaj",23);
        Hash3 h2 = new Hash3 ("Vijay",22);
        Hash3 h3 = new Hash3("Ganesh",22);

        info.put(101,h1);
        info.put(102,h2);
        info.put(103,h3);
        info.put(104,new Hash3("Digvijay",23));

        for (int data : info.keySet()){
            System.out.println(data);
        }


    }

}