import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        // UC3 Validation
        if (firstWord.trim().contains(" ")) {
            System.out.println(firstWord + " is an invalid word");
            scanner.close();
            return;
        }

        if (secondWord.trim().contains(" ")) {
            System.out.println(secondWord + " is an invalid word");
            scanner.close();
            return;
        }

        // UC4 + UC5 Logic
        String reversed = new StringBuilder(firstWord).reverse().toString();

        if (reversed.equalsIgnoreCase(secondWord)) {

            String transformed = reversed
                    .toLowerCase()
                    .replaceAll("[aeiou]", "@");

            System.out.println(transformed);

        } else {
            System.out.println("Words are NOT reverse of each other");
        }

        scanner.close();
    }
}
