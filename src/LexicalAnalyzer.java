public class LexicalAnalyzer {

    public void process(String firstWord, String secondWord) {

        String reversed = new StringBuilder(firstWord).reverse().toString();

        if (reversed.equalsIgnoreCase(secondWord)) {
            transform(reversed);
        } else {
            combineAndAnalyze(firstWord, secondWord);
        }
    }

    private void transform(String word) {

        String result = word
                .toLowerCase()
                .replaceAll("[aeiou]", "@");

        System.out.println(result);
    }

    private void combineAndAnalyze(String first, String second) {

        String combined = (first + second).toUpperCase();

        int vowels = 0;
        int consonants = 0;

        for (char ch : combined.toCharArray()) {

            if ("AEIOU".indexOf(ch) != -1) {
                vowels++;
            } else if (Character.isLetter(ch)) {
                consonants++;
            }
        }

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

    private void printFirstTwoUnique(String word, boolean vowelMode) {

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
