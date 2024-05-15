// Write a program to accept following information about an employee a. name,address,designation b. create subclass manager from employee class. add some extra attributes. c. demonstrate use of overloading ,overriding methods and nested class.
package practicalassign;
import java.util.Scanner;

class employee {
    String name, address, deg;

    void getinfo(String name, String address, String deg) {
        this.name = name;
        this.address = address;
        this.deg = deg;
    }
    // overloading and overriding
    void display() {
        System.out.println("Your name: " + name);
        System.out.println("Your address: " + address);
        System.out.println("Your designation: " + deg);
    }
    // nested class
    class nested {
        int id;

        nested(int id) {
            this.id = id;
        }

        void displayid() {
            System.out.println("Your id: " + id);
        }
    }

    // overloading
    void display(int id) {
        nested n1 = new nested(id);
        n1.displayid();
    }
}

class manager extends employee {
    int age, salary;

    manager(String name, String address, String deg, int age, int salary) {
        // super.getinfo(name, address, deg); // This line passes values to the superclass constructor
        this.age = age;
        this.salary = salary;
    }

    // Override
    void display() {
        System.out.println("Your age: " + age);
        System.out.println("Your salary: " + salary);
    }
}

public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your address:");
        String address = sc.nextLine();
        System.out.println("Enter your designation:");
        String deg = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter your salary:");
        int sal = sc.nextInt();
        System.out.println("Enter your id:");
        int id = sc.nextInt();

        employee e1 = new employee();
        manager m1 = new manager(name, address, deg, age, sal);
        e1.getinfo(name, address, deg);
        e1.display(id);
        e1.display();
        m1.display();
    }
}