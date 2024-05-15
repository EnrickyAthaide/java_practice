// Write a Java program Create abstract class shape. Drive three classes sphere. Cone
// and cylinder from it.
// Calculate Area and volume of all
package practice;

import java.util.*;

 abstract class gugu{
    public abstract void area();
}
class sphere extends gugu{
    public void area(){
        Scanner radi = new Scanner(System.in);
        System.out.println("enter the radius of the sphere:");
        double radius=radi.nextDouble();
        System.out.println("area of the circle:"+(4*Math.PI*radius*radius));
    }
        }
class cone extends gugu{
    public void area(){
        Scanner radi = new Scanner(System.in);
        System.out.println("enter the radius of the base of the cone:");
        double slantheight=radi.nextDouble();
        System.out.println("enter the slant height of the cone:");
        double radius=radi.nextDouble();
        System.out.println("area of the cone:"+(Math.PI*radius*(radius+slantheight)));
    }
}
public class area {
    public static void main(String[] args){
        System.out.println("welcome sir, may i know your name?:");
        Scanner scanner = new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("welcome "+name+"!!! which objects area do you wanna find??(sphere cone or cylinder?):");
        String shape = scanner.nextLine();
        if(shape.equals("sphere")){
            sphere ara = new sphere();
            ara.area();
        }
        else if(shape.equals("cone")){
            cone ara = new cone();
            ara.area();
        }
       
        else{
            System.out.println("please enter only the name of the shapes mentioned above");
        }
    }
}
