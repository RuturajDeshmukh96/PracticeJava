package oops;

class Constructor1 {
int a ;
int b;

    public Constructor1(int a , int b){

        this.a = a;
        this.b=b;
        System.out.println(a+b);
        System.out.println(" This is the constructor example");
        }
        public void hello(){
        System.out.println(" original hello");
        }
    }
   interface Magic {
     void menu();
     default void maya(){
         System.out.println("this is difault method from interface ");
         maya1();

     }
     private void maya1(){
         System.out.println("2nd private method from interface ");
     }
   }





class Two extends Constructor1 implements  Magic {

   public Two( int a , int  b ){

       super(a,b);


     }

    public static void main(String[] ars)
    {

        Two obj = new Two (11,22);
      obj.hello();
      obj.menu();
      obj.maya();


      //  Constructor1 One = new Constructor1();
    //One.hello();
    }
    @Override
    public void hello(){
        System.out.println("hello from override ");

        super.hello();
        //super.
    }

    @Override

    public void menu(){
       System.out.println("oveerridden from  abstact method  ");

    }



}