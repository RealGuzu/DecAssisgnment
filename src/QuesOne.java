import java.util.Scanner;

public class QuesOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double  x,y,z,f,g;


        System.out.print("Input Number #1: ");
        x = scanner.nextDouble();

        System.out.print("Input Number #2: ");
        y = scanner.nextDouble();
        
        System.out.print("Input Number #3: ");
        z = scanner.nextDouble();

        System.out.print("Input Number #4: ");
        f = scanner.nextDouble();

        System.out.print("Input Number #5: ");
        g = scanner.nextDouble();

        double sum = x + y + z + f + g ;
        double avg = sum / 5 ;

        System.out.println( "The sum is: " +sum);
        System.out.println("The average is: " +avg);
        
        scanner.close();

    }
    
}