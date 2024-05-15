package pattern.practical;

import java.util.Scanner;

public class greatsmoll {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
     System.out.println("enter first number:");
     a=sc.nextInt();
     System.out.println("enter second number");
     b=sc.nextInt();
     if (a>b){
        System.out.println();
        c=a;
        a=b;
        b=c;
        for(int i=a+1;i<b;i++)
        {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
            
        }
        else{
            System.out.println(b+" is greater than "+a);
        }
     }
    }
