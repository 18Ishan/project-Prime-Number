import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lower limit: ");
        int lowerLimit = scanner.nextInt();

        System.out.println("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + " are: ");

        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
