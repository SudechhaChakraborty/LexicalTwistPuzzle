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

        String reversed = new StringBuilder(firstWord).reverse().toString();

        if (reversed.equalsIgnoreCase(secondWord)) {

            // UC5 Transformation
            String transformed = reversed
                    .toLowerCase()
                    .replaceAll("[aeiou]", "@");

            System.out.println(transformed);

        } else {

            // UC6 Combine & Count
            String combined = (firstWord + secondWord).toUpperCase();

            int vowels = 0;
            int consonants = 0;

            for (char ch : combined.toCharArray()) {

                if ("AEIOU".indexOf(ch) != -1) {
                    vowels++;
                } else if (Character.isLetter(ch)) {
                    consonants++;
                }
            }

            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }

        scanner.close();
    }
}
