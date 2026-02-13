import java.util.Scanner;

public class LexicalTwistPuzzle {

    public static void main(String[] args) {

        System.out.println("Lexical Twist Puzzle");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = scanner.nextLine();

        System.out.print("Enter second word: ");
        String secondWord = scanner.nextLine();

        // ✅ UC3 Validation Logic

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

        // (Next UCs will add logic here)

        scanner.close();
    }
}
