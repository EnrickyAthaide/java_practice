package practice;

import java.util.Scanner;
public class pelindrome {
    public static void main(String[] args) {
        int num,reverse=0,copy,remainder=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        num=sc.nextInt(); //151
        copy=num;
        while (copy>0)
        {
            remainder=copy%10;  //151 / 10 = 1(remainder),15 /10 = 5(remainder),
            reverse=(reverse*10)+remainder; // 0*10+1=1 , 1*10 +5 =15,
            copy=copy/10; // 151/10 = 15(quotient), 15/10=1,
        }
        if (num==reverse)
        System.out.println(num+" is a palindrome number");
        else
        {
        System.out.println(num + "is not a palindrome number");
    }
    }
    
}
