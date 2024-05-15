package practice;

import java.util.Scanner;
                                                         //153=(1*1*1)+(5*5*5)+(3*3*3)
public class armstrong {
    public static void main(String[] args) {
        double val=1,j=1;
        int n,arm=0,change;
        System.out.println("enter the number you want to check whether or not its armstrong:");
        Scanner num=new Scanner(System.in);
        n=num.nextInt();
        change=n;

        while (change!=0) {
            val=change%10;
            arm+=Math.pow(val, 3);
            change/=10;
        }
        System.out.println(arm);
        if (n==arm) {
            System.out.println("thne number you entered is armstrong:");
        }
        else{
            System.out.println("the number you entered isnt armstrong:");
        }
    }
}
