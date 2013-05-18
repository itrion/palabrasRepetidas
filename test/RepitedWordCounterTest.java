
import static junit.framework.Assert.*;
import org.junit.Test;
import org.repitedwordcounter.RepitedWordCounter;

public class RepitedWordCounterTest {

    @Test
    public void noRepitedWord() {
        String textOne = "Good Morning, Buenos Días, Guten Morgen";
        String textTwo = "Bye bye, Adíos, viszlát";
        RepitedWordCounter repitedWordCounter = new RepitedWordCounter(textOne, textTwo);
        assertEquals(0, repitedWordCounter.count());
    }

    @Test
    public void oneRepitedWord() {
        String textOne = "Good Morning, Aloha. Guten Morgen";
        String textTwo = "Good monring people";
        RepitedWordCounter repitedWordCounter = new RepitedWordCounter(textOne, textTwo);
        assertEquals(1, repitedWordCounter.count());
    }

    @Test
    public void TwoRepitedWord() {
        String textOne = "Hi, Aloha, Guten Morgen";
        String textTwo = "how do say Guten Morgen in french?";
        RepitedWordCounter repitedWordCounter = new RepitedWordCounter(textOne, textTwo);
        assertEquals(2, repitedWordCounter.count());
    }
}