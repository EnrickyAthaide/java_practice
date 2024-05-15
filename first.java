import java.util.*;

public class first {
    public static  void main(String[] args) {
        int a,b,c;
        Scanner obj= new Scanner(System.in);
        System.out.println("enter value of a:");
        a=obj.nextInt();
        System.out.println("enter value of b:");
        b=obj.nextInt();
        System.out.println("enter value of c:");
        c=obj.nextInt();
     if (c>a && c>b) {
           
            System.out.println("c is the greatest number");
    }
        else  if (b>a && b>c) {
           
            System.out.println("b is the greatest number");
    }
        else  if (a>c && a>b) {
                System.out.println("a is the greatest number");
        }
        else {
            System.out.println("please enter different values");
        }
        obj.close();
    }
}
