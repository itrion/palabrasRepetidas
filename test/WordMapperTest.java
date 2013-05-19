
import java.util.List;
import static junit.framework.Assert.*;
import org.junit.Test;
import org.repitedwordcounter.WordRepitedRemover;


public class WordMapperTest {

    @Test
    public void textWithoutWords() {
        String empty = "";
        WordRepitedRemover wordRepitedRemover = new WordRepitedRemover(empty);
        wordRepitedRemover.removeRepited();
        assertEquals(0, wordRepitedRemover.size());
    }

    @Test
    public void textWithThreeWords() {
        String threeWords = "one two three";
        WordRepitedRemover wordRepitedRemover = new WordRepitedRemover(threeWords);
        wordRepitedRemover.removeRepited();
        assertEquals(3, wordRepitedRemover.size());
        assertEquals("one", wordRepitedRemover.getProcessedWords().get(0));
        assertEquals("two", wordRepitedRemover.getProcessedWords().get(1));
        assertEquals("three", wordRepitedRemover.getProcessedWords().get(2));
    }

    @Test
    public void textWithThreeWordsOneIsRepeated() {
        String threeWords = "one two two three one";
        WordRepitedRemover wordRepitedRemover = new WordRepitedRemover(threeWords);
        wordRepitedRemover.removeRepited();
        assertEquals(3, wordRepitedRemover.size());
        assertEquals("one", wordRepitedRemover.getProcessedWords().get(0));
        assertEquals("two", wordRepitedRemover.getProcessedWords().get(1));
        assertEquals("three", wordRepitedRemover.getProcessedWords().get(2));
    }
}