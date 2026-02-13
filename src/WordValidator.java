public class WordValidator {

    public boolean isValid(String word) {

        if (word == null || word.trim().contains(" ")) {
            return false;
        }

        return true;
    }
}
