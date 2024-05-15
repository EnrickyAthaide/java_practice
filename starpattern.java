import java.util.Scanner;

public class starpattern {
    public static void main(String args[])
    {
        int i,j,c;
        Scanner bbc= new Scanner(System.in);
        System.out.println("enter no. of rows:");
        c= bbc.nextInt();
        bbc.close();
        for(i=1;i<=c;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
