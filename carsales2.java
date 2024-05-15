import java.util.Scanner;

public class carsales2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to buy a car, sir?");
        String cars = scan.next();
        
        if (cars.equalsIgnoreCase("yes")) {
            System.out.println("What's your budget?");
            double budget = scan.nextDouble();
            
            if (budget >= 70000 && budget <= 100000) {
                System.out.println("These are the cars available in your budget:");
                System.out.println("1) Maruti s10 price: 72000");
                System.out.println("2) Sukimisu 500 price: 84000");
                System.out.println("3) Kazuke 200  price: 93000");
                int choice;
                do {
                    System.out.println("Choose the corresponding number to which car you want to choose:");
                    choice = scan.nextInt();
                    if (choice == 1 || choice == 2 || choice == 3) {
                        System.out.println("Thank you for your purchase, sir. Hope to see you again.");
                    } else {
                        System.out.println("Please select one of the provided options.");
                    }
                } while (!(choice == 1 || choice == 2 || choice == 3));
            } else if (budget >= 100000 && budget <= 200000) {
                System.out.println("These are the cars available in your budget:");
                System.out.println("1) Maruti s20 price: 172000");
                System.out.println("2) Sukimisu 900 price: 184000");
                System.out.println("3) Kazuke 500  price: 123000");
                int choice1;
                do {
                    System.out.println("Choose the corresponding number to which car you want to choose:");
                    choice1 = scan.nextInt();
                    if (choice1 == 1 || choice1 == 2 || choice1 == 3) {
                        System.out.println("Thank you for your purchase, sir. Hope to see you again.");
                    } else {
                        System.out.println("Please select one of the provided options.");
                    }
                } while (!(choice1 == 1 || choice1 == 2 || choice1 == 3));
            } else if (budget >= 200000 && budget <= 500000) {
                System.out.println("These are the cars available in your budget:");
                System.out.println("1) BMW price: 420069");
                System.out.println("2) Fortunier price: 420000");
                System.out.println("3) Kazuke 500  price: 123000");
                int choice2;
                do {
                    System.out.println("Choose the corresponding number to which car you want to choose:");
                    choice2 = scan.nextInt();
                    if (choice2 == 1 || choice2 == 2 || choice2 == 3) {
                        System.out.println("Thank you for your purchase, sir. Hope to see you again.");
                    } else {
                        System.out.println("Please select one of the provided options.");
                    }
                } while (!(choice2 == 1 || choice2 == 2 || choice2 == 3));
            } else {
                System.out.println("We don't have any cars within this budget, sir. Sorry for the inconvenience.");
            }
        } else {
            System.out.println("Thank you for visiting, sir.");
        }
        scan.close();
    }
}

