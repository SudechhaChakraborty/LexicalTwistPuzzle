import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        WordValidator validator = new WordValidator();

        if (!validator.isValid(firstWord)) {
            System.out.println(firstWord + " is an invalid word");
            scanner.close();
            return;
        }

        if (!validator.isValid(secondWord)) {
            System.out.println(secondWord + " is an invalid word");
            scanner.close();
            return;
        }

        LexicalAnalyzer analyzer = new LexicalAnalyzer();
        analyzer.process(firstWord, secondWord);

        scanner.close();
    }
}
