package Scenario_Based;
class Amazon {


    public void search(String Mobile_Name  ) {
        System.out.println(" The model name, price & Ram/Rom of the mobile is  :" + Mobile_Name );
    }
    public void search(int Mobile_price){
        System.out.println("the model price is the " + Mobile_price);
    }
    public void search(String Proceesor , long Antutu_score){
        System.out.println("the processor of this model is : "+ Proceesor + "   "  + "the antutu score of this model is " +  Antutu_score);

    }
}
     class Overloading  {
    public static void main (String [] raj){

        Amazon search = new Amazon();

        search.search("Nothing4A-8/128");
        search.search(40000);
        search.search("Snapdragon ",1000000L);


    }

}