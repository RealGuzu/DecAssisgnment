import java.util.Scanner;

public class QuesTwo {
    
    private int number;
    private int fact;

    public QuesTwo(int number) {
        this.number = number;
        this.fact = factorial(number);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enteredNumber;

        System.out.print("Enter the number: ");
        enteredNumber = scanner.nextInt();

        QuesTwo obj = new QuesTwo(enteredNumber);

        System.out.println("Factorial of " + obj.number + " is: " + obj.fact);

        scanner.close();
    }
}
