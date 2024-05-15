// crate a program to print tables 1 to 20 using thread
package practice;

import java.util.Scanner;

// import practice.table1.userdefined;

public class tables {
    public static void main(String[] args){
        // table1 arrr = new table1();
        // arrr.start();
        userdefined ola = new userdefined();
        

    }
}


/**
 * Innertables
 */
 class table1 extends Thread {
    public void run(){
        int i=1,tab=1;
        for(i=1;i<=20;i++){
            System.out.println(" ");;
            System.out.println(" Table of  "+i);
            System.out.println(" ");
            for(tab=1;tab<=10;tab++)
            {
                System.out.println(i+" x "+tab +"="+(i*tab));
                
            }
        }
    }

   
}
class userdefined{
    userdefined(){
    long i=1,tab=1;
    System.out.println("enter :");
    Scanner play = new Scanner(System.in);
    long yolo=play.nextLong();
    System.out.println("enter :");
    long polo=play.nextLong();
    for(i=yolo;i<=polo;i++){
        System.out.println(" ");
        System.out.println(" Table of  "+i);
        System.out.println(" ");
        for(tab=1;tab<=10;tab++)
        {
            System.out.println(i+" x "+tab +"="+(i*tab));
            
        }
    }
    }
}