package trycatch;
import java.util.*;
public class driversli {
    public static void main(String[] args) {
        try{
            System.out.println("enter your age:");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a < 18) {
                throw new Innerdriversli();                                
            }
            else{
                System.out.println("congrats for the license");
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
/**
 * Innerdriversli
 */
 class Innerdriversli extends Exception {
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "you are under 18 please grow up or go to KOTA";
    }
}