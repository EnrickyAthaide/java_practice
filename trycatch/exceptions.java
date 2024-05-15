package trycatch;
import java.util.Scanner;

 class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

class NumberIsZeroException extends Exception {
    public NumberIsZeroException(String message) {
        super(message);
    }
}

public class exceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        try {
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            
            if (number == 0) {
                throw new NumberIsZeroException("Number is Zero");
            } else if(!input.matches("[0-9]+")) {
                throw new InvalidNumberException("Number is Invalid");
            } else {
                if (isPalindrome(input)) {
                    System.out.println("The number is a palindrome.");
            } else {
                    System.out.println("The number is not a palindrome.");
                }
            // else{
                
            //     System.out.println("you entered a valid number now lets check if its pelindrome or not");
                
            // }
            }
        } catch (NumberFormatException e) {
            System.out.println("Number is Invalid");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        } catch (NumberIsZeroException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}

