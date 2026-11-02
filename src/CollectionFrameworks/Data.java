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
        Data d5 = new Data("Messi");

        System.out.println("This is listing the List now :- Data\n" );

        data.add(d1);
        data.add(d2);
        data.add(d3);
        data.add(d4);
        data.add(d5);





        data.addFirst(new Data("dj\n"));
        data.remove(d5);
      //  Data.removeLast();
        for (Data d : data){
        System.out.println(d.name);
    }}
}