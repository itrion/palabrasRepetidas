
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
}