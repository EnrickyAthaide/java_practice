package practicalassign;
import java.util.*;
public class practial2{

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println( "Enter a number" );
            int number1= sc.nextInt();
            int temp=number1;
            int remainder,reverse=0;
            while  (number1>0){
                remainder= number1%10;
                reverse=reverse*10+remainder;
                number1=number1/10;
            }
            int sum=0;
            System.out.println("Reverse is "+reverse);
            while  (temp>0){
                remainder= temp%10;
                sum=sum+remainder;
                temp=temp/10;
            }
            System.out.println("Sum of Digits: "+sum);
        }
    }
