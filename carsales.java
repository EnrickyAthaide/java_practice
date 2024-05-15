// wap to manage a car sales showroom while  taking  care  of  the following requirements:
//1. To ask the buyers budget 
//2. to show him models based on his budget
//3. to ask weather hes gonna pay online or offline
import java.util.Scanner;

public class carsales {
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.println("do you wanna buy a car sir??:");
      String cars = scan.next();
      if (cars.equals("yes")) {
        System.out.println("whats your budget?:");
        double budget = scan.nextDouble();
        if (budget<=100000 && budget>=70000) {
            System.out.println("thes are the cars available in your budget:");
            System.out.println("1) Maruti s10 price: 72000");
            System.out.println("2)Sukimisu 500 price: 84000");
            System.out.println("3)Kazuke 200  price: 93000");
            int choice;
            do{
            System.out.println("choose the corresponding number to which car you want to choose:");
             choice= scan.nextInt();
            if (choice==1 || choice==2 || choice==3 ) {
                System.out.println("thank your for your purchase sir hope to see you again");
            }
            else {
                System.out.println("please select one of the provided options");
            }
        }while(!(choice==1||choice==2||choice==3));
            }
           else if (budget<=200000 && budget>=100000) {
                System.out.println("thes are the cars available in your budget:");
                System.out.println("1) Maruti s20 price: 172000");
                System.out.println("2)Sukimisu 900 price: 184000");
                System.out.println("3)Kazuke 500  price: 123000");
                int choice1;
                do{
                System.out.println("choose the corresponding number to which car you want to choose:");
                choice1= scan.nextInt();
                if (choice1==1 || choice1==2 || choice1==3 ) {
                    System.out.println("thank your for your purchase sir hope to see you again");
                }
                else {
                    System.out.println("please select one of the provided options");
                }
            }while(!(choice1==1||choice1==2||choice1==3));
        }

                else if (budget<=500000 && budget>=200000) {
                    System.out.println("thes are the cars available in your budget:");
                    System.out.println("1) BMW price: 420069");
                    System.out.println("2)fortunier price: 420000");
                    System.out.println("3)Kazuke 500  price: 123000");
                    int choice2;
                    do{
                    System.out.println("choose the corresponding number to which car you want to choose:");
                    choice2= scan.nextInt();
                    if (choice2==1 || choice2==2 || choice2==3 ) {
                        System.out.println("thank your for your purchase sir hope to see you again");
                    }
                    else {
                        System.out.println("please select one of the provided options");
                    }
                }while(!(choice2==1||choice2==2||choice2==3));


        }
        else{
            System.out.println("we dont have any cars within this budget sir sorry for the inconvinience");
        }
    }
    else{
        System.out.println("thank you for visiting sir");
    }
scan.close();
} 
}
