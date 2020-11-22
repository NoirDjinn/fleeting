// https://leetcode.com/problems/unique-morse-code-words/
import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static int uniqueMorseRepresentations(String[] words) {
        Set<String> uniqueMorseStrings = new HashSet<>();
        String[] charToMorse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        StringBuilder morsifiedWord;
        for (String word: words) {
            morsifiedWord = new StringBuilder();
            for (char c: word.toCharArray()) {
                morsifiedWord.append(charToMorse[c - 'a']);
            }
            uniqueMorseStrings.add(morsifiedWord.toString());
        }
        return uniqueMorseStrings.size();
    }
}
