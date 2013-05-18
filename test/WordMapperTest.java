
import static junit.framework.Assert.*;
import org.junit.Test;
import org.repitedwordcounter.WordMapper;


public class WordMapperTest {

    @Test
    public void textWithNoWords() {
        String empty = "";
        WordMapper wordMapper = new WordMapper(empty);
        wordMapper.map();
        assertEquals(0, wordMapper.size());
    }

    @Test
    public void textWithThreeWords() {
        String threeWords = "one two three";
        WordMapper wordMapper = new WordMapper(threeWords);
        wordMapper.map();
        assertEquals(0, wordMapper.size());
    }

    @Test
    public void textWithThreeWordsOneIsRepeated() {
        String threeWords = "one two three one";
        WordMapper wordMapper = new WordMapper(threeWords);
        wordMapper.map();
        assertEquals(0, wordMapper.size());
    }
}