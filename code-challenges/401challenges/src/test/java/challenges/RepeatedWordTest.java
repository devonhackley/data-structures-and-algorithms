package challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedWordTest {
    @Test public void testRepeatedWord(){
        String testStr = "Once upon a time, there was a brave princess who...";
        String expected = "a";
        RepeatedWord testLibrary = new RepeatedWord();

        assertEquals(expected, testLibrary.findReapeatedWord(testStr));
    }

    @Test public void testRepeatedWordNotFound(){
        String testStr = "The boy is strange, he doesn't eat.";
        String expected = "not found";

        RepeatedWord testLibrary = new RepeatedWord();

        assertEquals(expected, testLibrary.findReapeatedWord(testStr));
    }
}
