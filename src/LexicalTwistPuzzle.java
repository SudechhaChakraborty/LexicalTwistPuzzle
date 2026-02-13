import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        // ✅ UC3 Validation
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

        // Reverse first word
        String reversed = new StringBuilder(firstWord).reverse().toString();

        // ✅ UC5 (if reverse match)
        if (reversed.equalsIgnoreCase(secondWord)) {

            String transformed = reversed
                    .toLowerCase()
                    .replaceAll("[aeiou]", "@");

            System.out.println(transformed);

        } else {

            // ✅ UC6 Combine & Count
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

            // ✅ UC7 Rule-Based Output

            if (vowels > consonants) {
                printFirstTwoUnique(combined, true);
            }
            else if (consonants > vowels) {
                printFirstTwoUnique(combined, false);
            }
            else {
                System.out.println("Vowels and consonants are equal");
            }
        }

        scanner.close();
    }

    // ✅ Helper Method for UC7
    private static void printFirstTwoUnique(String word, boolean vowelMode) {

        String seen = "";
        int count = 0;

        for (char ch : word.toCharArray()) {

            boolean isVowel = "AEIOU".indexOf(ch) != -1;

            if (vowelMode == isVowel && seen.indexOf(ch) == -1) {

                System.out.print(ch + " ");
                seen += ch;
                count++;
            }

            if (count == 2)
                break;
        }

        System.out.println();
    }
}
