import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniqueMorseCodeWordsTest {
    @Test
    void test1() {
        String[] inp = {"gin", "zen", "gig", "msg"};
        int res = UniqueMorseCodeWords.uniqueMorseRepresentations(inp);
        assertEquals(res, 2);
    }
}
