package trycatch;
import java.util.*;

public class admission {
    public static void main(String[] args){
        int i,j;
        System.out.println("enter the number of subjects you had:");
        Scanner sc = new Scanner(System.in);
        j=sc.nextInt();
        int[] marks = new int[j];
        System.out.println("enter marks of your subjects:");
        for(i=0;i<marks.length;i++)
        {
            marks[i]=sc.nextInt();

        }
        System.out.println("the marks you entered are as follows:");
        for(i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        for(i=0;i<marks.length;i++)
        {
            

        }
        sc.close();
    }
    
}
