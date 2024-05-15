// creat a application to take 2 numbers from a user and then calculate the square of those numbers then add the square of those numbers
package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class areaadd {
    public static void main(String[] args){
        double a,b,sq1,sq2;
        BufferedReader num1 = new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("enter the first number:");
            a = Double.parseDouble(num1.readLine());
            
            System.out.println("enter the second number:");
            b = Double.parseDouble(num1.readLine());
           
            sq1=a*a;
       sq2=b*b;
       double sum=sq1+sq2;
       System.out.println("square of the numbers:"+sq1+" "+sq2);
       System.out.println("sum of their squares:"+sum);
       num1.close();
        } 
        catch(Exception ax){
            System.out.println(ax);
           
        }
       
       

    }
}
