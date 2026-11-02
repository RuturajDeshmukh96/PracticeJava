package CollectionFrameworks;

import java.util.LinkedList;

public class Data{

    String name;

    public Data(String name ) {
   this.name = name ;
   System.out.println("This is Printing the Name : " + name );
    }
}
class Data1 {
    public static void main(String [] args ){
        LinkedList<Data> data = new LinkedList<>();
        Data d1 = new Data("Ruturaj");
        Data d2 = new Data("Rahul");
        Data d3 = new Data("Rohit");
        Data d4 = new Data("Ronaldo");

        data.addFirst(new Data("dj"));
        data.removeLast();
        for (Data d : data){
        System.out.println(d.name);
    }}
}