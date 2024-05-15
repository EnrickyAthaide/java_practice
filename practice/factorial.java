package practice;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int fact=1,n,i;
        System.out.println("enter the number you want to print factorial of:");
        Scanner num = new Scanner(System.in);
        n=num.nextInt();
        for(i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("factorial of "+n+" is "+fact);

    }
    
    
}
