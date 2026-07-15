package Practice;
public class What1{

    public static void main(String[]args){

        operation("add");
        operation("minus");
        operation("multiply");
        operation("done");

    }
    public static void operation(String opp){
        if(opp.equals("add")){

            add(10,400);
        }
        else if(opp.equals("multiply")){

            multi(400,1000);
        }
        else if(opp.equals("minus")){

            minus(100,3029);

        }
        else{
            System.out.println("invalid opperation");
        }


    }
    public static void add(int a,int b){

       System.out.println(a + b);
    }
    public static void minus(int a ,int b){

        System.out.println(a - b);
    }
    public static void multi(int a ,int b){

        System.out.println(a * b);
    }
}//