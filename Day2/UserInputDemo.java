package Day2;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Step 2: Create Scanner
        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // Read String
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // Read integer
        System.out.print("Enter your GPA: ");
        double gpa = sc.nextDouble(); // Read decimal
        System.out.println("Welcome, " + name + "!");
        System.out.println("Age: " + age + ", GPA: " + gpa);
}

    
}
