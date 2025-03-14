import java.util.Scanner;

public class vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0);
        letter = Character.toLowerCase(letter);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println(letter + " is a vowel.");
        } else {
            System.out.println(letter + " is not a vowel.");
        }

        scanner.close();
    }
}