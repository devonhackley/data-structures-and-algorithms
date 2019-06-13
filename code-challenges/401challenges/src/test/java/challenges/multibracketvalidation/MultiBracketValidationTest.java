package challenges.multibracketvalidation;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {
    @Test public void testBracketValidation(){
        String testVal = "{}";
        assertTrue(MultiBracketValidation.multiBracketValidation(testVal));
    }
    @Test public void testBracketValidationMulti(){
        String testVal = "{}(){}";
        assertTrue(MultiBracketValidation.multiBracketValidation(testVal));
    }
    @Test public void testBrackectValidationLetters(){
        String testVal = "()[[Extra Characters]]";
        assertTrue(MultiBracketValidation.multiBracketValidation(testVal));
    }
    @Test public void testBrackectValidationInner(){
        String testVal = "(){}[[]]";
        assertTrue(MultiBracketValidation.multiBracketValidation(testVal));
    }
    @Test public void testBrackectValidationNotBalanced(){
        String testVal1 = "[({}]";
        String testVal2 = "(](";

        assertFalse(MultiBracketValidation.multiBracketValidation(testVal1));
        assertFalse(MultiBracketValidation.multiBracketValidation(testVal2));
    }
}
