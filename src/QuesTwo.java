import java.util.Scanner;

public class QuesTwo {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fact;

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        fact = factorial(number);

        System.out.println("Factorial of " + number + " is: " + fact);

        scanner.close();
    }
}
