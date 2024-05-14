import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        int number;

        Scanner Checker = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        
        if (Checker.hasNextInt()) {
            number = Checker.nextInt();
        
            if ( number % 2 != 0) {
                System.out.println( number + " is an ODD Number ");
            } 
            else {
                System.out.println( number + " is an Even number");
            }
    } else {
        System.out.println("Invalid input");
    }
      Checker.close();

    }
}
