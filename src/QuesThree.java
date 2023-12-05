import java.util.Scanner;

public class QuesThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some text: ");
        String userInput = scanner.nextLine();

        if (userInput.matches("\\d+")) {  // \\d+ matches any digit between 0 - 9 and any reoccurrences of these numbers.
            System.out.println("This is a number not a string."); //prints this sentence if no characters are found.
        } else {
            System.out.println("This is a string."); // prints this line if there are no numbers detected.
        }

        scanner.close();
    }
}
                        