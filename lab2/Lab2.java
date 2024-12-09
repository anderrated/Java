package lab2;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
 
        if(num <= 1){
            System.out.println("The number is not a prime number");
            return;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                System.out.println("The number is not a prime number");
                return;
            }
        }
        System.out.println("The number is a prime number");
    }
}