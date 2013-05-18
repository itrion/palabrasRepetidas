
import static junit.framework.Assert.*;
import org.junit.Test;
import org.repitedwordcounter.WordRepitedRemover;


public class WordMapperTest {

    @Test
    public void textWithNoWords() {
        String empty = "";
        WordRepitedRemover wordRepitedRemover = new WordRepitedRemover(empty);
        wordRepitedRemover.removeRepited();
        assertEquals(0, wordRepitedRemover.size());
        wordRepitedRemover.getProcessedWords();
        
    }

    @Test
    public void textWithThreeWords() {
        String threeWords = "one two three";
        WordRepitedRemover WordRepitedRemover = new WordRepitedRemover(threeWords);
        WordRepitedRemover.removeRepited();
        assertEquals(3, WordRepitedRemover.size());
    }

    @Test
    public void textWithThreeWordsOneIsRepeated() {
        String threeWords = "one two three one";
        WordRepitedRemover WordRepitedRemover = new WordRepitedRemover(threeWords);
        WordRepitedRemover.removeRepited();
        assertEquals(3, WordRepitedRemover.size());
    }
}