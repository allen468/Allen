import java.util.Scanner;

public class addition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        String userChoice;

        System.out.println("Dynamic Calculator - Addition Only");
        System.out.println("You can continuously add numbers. Type 'exit' to quit.");
        do {
            System.out.println("\nCurrent result: " + result);
            System.out.print("Enter a number to add: ");
            userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                double number = Double.parseDouble(userChoice);
                result += number;  
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or 'exit' to quit.");
            }
        } while (true);

        System.out.println("Final result: " + result);
        scanner.close();
    }
}
