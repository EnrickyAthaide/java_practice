package arrays;
import java.util.Scanner;

public class arrayswithloops {
    public static void main(String[] args){
        int i,j;
        Scanner com = new Scanner(System.in);
        System.out.println("enter the number of nos. you wanna save in the array:");
         j=com.nextInt();
    int[] number = new int[j];  // creating an array called number that contains 5 numbers
    System.out.println("enter the numbers you want to store:");
    for(i=0;i<j;i++){
      
     number[i]=com.nextInt();
     System.out.println("");
    }
    System.out.println("the numbers entered are as follows:");
    for(i=0;i<j;i++){
        System.out.println(number[i]);
       }
       System.out.println("do you want to add any 2 numbers you saved within the array? yes/no:");
       String v;
       v=com.next();
       if(v.equals("yes"))
       {
       System.out.println("enter the serial number of the numbers you wanna add:");
       int a=com.nextInt();
       int b=com.nextInt();
       
        System.out.println("please enter a valid serial number ");
    

       int c=number[a-1]+number[b-1];
    System.out.println(c); 

       }
       else{
        System.out.println("thank you for using this program.");
       }
    com.close(); 
    
    }
   
 }

    
    

