import java.util.Scanner;

public class  bitch{

    public static void main(String args[])
    {
        String a;
        Scanner comp= new Scanner(System.in);
        System.out.println("Enter the string:");
        a= comp.nextLine();
        switch (a) {
            case "red":
                System.out.println(1);
                break;
                case "green":
                System.out.println(2);
                break;
                case "blue":
                System.out.println(3);
                break;
            default:
            System.out.println("please enter rgb name");
                break;
        }
        comp.close();
    }
}