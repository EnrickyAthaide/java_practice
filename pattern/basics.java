package pattern;

import java.util.*;

public class basics {
    public static void main(String[] args) {

        // // abcd
        // // abc
        // // ab
        // // a
        // char str;
        // for (char i= 1;i>n;i++)
        // {
        // for(int j=65;j<i;j++)
        // {

        // }
        // }
        // }
        // System.out.println("Enter Starting char : ");
        // Scanner s=new Scanner(System.in);
        // char c=s.next().charAt(0);
        // System.out.println("Enter Ending char : ");
        // char c1=s.next().charAt(0);

        // for (char i = c; i <= c1; i++) {
        // for (char j = c; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // // 1
        // // 12
        // // 123
        // // 1234
        // // 123
        // // 12
        // // 1
        // int i, j;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a number:");
        // int n = sc.nextInt();
        // for (i = 1; i <= n; i++) {
        //     for (j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        // for(i=n-1;i>=1;i--){
        //     for(j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // // 1234
        // // 234
        // // 34
        // // 4
        // int i, j;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter a number:");
        // int n = sc.nextInt();
        // for (i =1; i <= n; i++) {
        //     for (j = i; j <= n; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // 5
        // 44
        // 333
        // 2222
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = sc.nextInt();
        for (i = n; i > 1; i--) {
            for (j = n; j >= i; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
