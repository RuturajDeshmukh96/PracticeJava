package Dynamic;

 class Dynamic1 {

    public void one() {
        System.out.println("One ");
    }

    public void two() {
        System.out.println("two");
    }

  static   class Dynamo extends Dynamic1 {
        public void three() {
            System.out.println("three");
        }

        public void four() {
            System.out.println("four");
        }
    }
}
public  class Dj {
    public static void main(String[] args) {

        Dynamic1.Dynamo d = new Dynamic1.Dynamo();

        d.one();    // ✅
        d.two();    // ✅
        d.three();  // ✅
        d.four();   // ✅

    }
}
