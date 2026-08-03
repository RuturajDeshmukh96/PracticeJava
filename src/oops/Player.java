package oops;

public class Player {
 String name ;
 int health ;

   public Player(String name , int health ){
    this.name = name ;
    this.health= health;
    System.out.println("this line is from the constructor");
    System.out.println(" this is player info :  " + name +"   and health is  "  + health);
   }
    public void shoot(){
    System.out.println("the player is firing the bullets ");
   }
 }
interface Powerups {
 void Defaultwall();

 default void review (){
  System.out.println("The player is reviewing player B");
 }

}
class Proplayer extends Player implements Powerups {

 public Proplayer (String name ,int health ){
  super(name,health);

 }
 public static void main (String [] args ){
  Proplayer obj = new Proplayer("rutu",100);
  obj.Defaultwall();
  obj.shoot();
  obj.review();
  //obj.Proplayer;
 }
 @Override
 public void Defaultwall(){
  System.out.println("Default Gloo Wall is placed! 🛡️");
 }

}