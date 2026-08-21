package CollectionFrameworks;
import java.util.HashSet;
import java.util.Objects;

public class HashSett {
    String name ;
    public HashSett (String  name ){
        this.name =  name ;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        HashSett hashSett = (HashSett) o;
        return Objects.equals(name, hashSett.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public static void main (String [] args ){

        HashSet<HashSett> done = new HashSet<>();
        HashSett j = new HashSett("Ruturaj ");
     HashSett j1 = new HashSett(" ganesh");
     HashSett j2 = new HashSett(" digvijay ");
     HashSett j3 = new HashSett("om");
     HashSett j4 = new HashSett("om");

     done.add(j);
     done.add(j1);
     done.add(j2);
     done.add(j3);
     done.add(j4);

     for (HashSett  pro : done ){
         System.out.println(pro.name);
     }


    }}
