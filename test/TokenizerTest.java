
import java.util.Arrays;
import java.util.List;
import static junit.framework.Assert.*;
import org.junit.Test;
import org.repitedwordcounter.Tokenizer;

public class TokenizerTest {

    @Test
    public void oneWord() {
        String text = "one";
        Tokenizer tokenizer = new Tokenizer(text);
        assertEquals("one", tokenizer.nextWord());
        assertNull(tokenizer.nextWord());
    }

    @Test
    public void wordsSeparatedBySpace() {
        String text = "one two";
        Tokenizer tokenizer = new Tokenizer(text);
        assertEquals("one", tokenizer.nextWord());
        assertEquals("two", tokenizer.nextWord());
        assertNull(tokenizer.nextWord());
    }

    @Test
    public void wordsSeparatedBySpecialCharacters() {
        String text = "one,two.three";
        Tokenizer tokenizer = new Tokenizer(text);
        assertEquals("one", tokenizer.nextWord());
        assertEquals("two", tokenizer.nextWord());
        assertEquals("three", tokenizer.nextWord());
        assertNull(tokenizer.nextWord());
        
    }

    @Test
    public void wordsSeparatedBySpaceAndSpecialCharacters() {
        String text = "one two_three";
        Tokenizer tokenizer = new Tokenizer(text);
        assertEquals("one", tokenizer.nextWord());
        assertEquals("two", tokenizer.nextWord());
        assertEquals("three", tokenizer.nextWord());
        assertNull(tokenizer.nextWord());
    }
    
    @Test
    public void processAllWords() {
        String text = "one two_three,four.five";
        Tokenizer tokenizer = new Tokenizer(text);
        tokenizer.processAllWords();
        List<String> expected = Arrays.asList(new String[]{"one", "two", "three", "four", "five"});
        List<String> found = tokenizer.getWordsFound();
        for(int i=0; i<expected.size();i++)
            assertEquals(expected.get(i), found.get(i));
    }
}