package lab1.mypackage;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Chicken chick1 = new Chicken();
        Chicken chick2 = new Chicken();
        Chicken chick3 = new Chicken();

        System.out.println("Enter name for chicken 1: ");
        chick1.name = scanner.nextLine();
        
        System.out.println("Enter name for chicken 2: ");
        chick2.name = scanner.nextLine();
        
        System.out.println("Enter name for chicken 3: ");
        chick3.name = scanner.nextLine();
        
        System.out.println("Chicken number 1 is named " + chick1.name);
        System.out.println("Chicken number 1 static variable: " + chick1.numChickens);
        System.out.println("Chicken number 2 is named " + chick2.name);
        System.out.println("Chicken number 2 static variable: " + chick2.numChickens);
        System.out.println("Chicken number 3 is named " + chick3.name);
        System.out.println("Chicken number 3 static variable: " + chick3.numChickens);
        
    }
    
}
