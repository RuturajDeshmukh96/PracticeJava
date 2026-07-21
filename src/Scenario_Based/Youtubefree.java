package Scenario_Based;
 class Youtubefree {

     public void watch(){
         System.out.println("the add is running ");
     }
 }


     class Watch extends Youtubefree {

     @Override

         public void watch(){
         System.out.println("the video is playing in the 4k ");
     }
     }

      class Done {

     public static void main (String [] args ){

         Watch obj = new Watch () ;

         obj.watch();
     }

     }