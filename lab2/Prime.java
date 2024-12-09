package lab2;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        if(isPrime){
            System.out.println("The number is a prime number");
        } else {
            System.out.println("The number is not a prime number");
        }
    }

    public static boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
