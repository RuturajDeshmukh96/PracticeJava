package Conditions;
import  java .util.*;
public class Prac {
    public static void main(String[] args) {

        System.out.println("enter your age") ;
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        switch (age) {

            case 18:
                System.out.println("you are able to vote in india ");
                break;

            case 21:
                System.out.println(" you are mature now");
                break;

            case 30:
                System.out.println(" you are senior citizens now");
                break;

            case 50:
                System.out.println(" you are  at the age of retirement  now ");
                break;
            default:
                System.out.println(" just live healthy life ");
            }

        }
    }
