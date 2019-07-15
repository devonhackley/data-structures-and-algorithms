package challenges.leftjoin;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
public class LeftJoinTest {
    @Test public void testLeftJoin(){
        HashMap<String, String> m1 = new HashMap<>();
        HashMap<String, String> m2 = new HashMap<>();
        Map<String, String[]> expected = new HashMap<>();

        m1.put("fond", "enamored");
        m2.put("fond", "averse");

        expected.put("fond", new String[]{"enamored, averse"});

        Map<String, String[]> result = LeftJoin.leftJoinMaps(m1,m2);

        assertEquals(expected.keySet(), result.keySet());

    }

    @Test
    public void testLeftJoinWithNull(){
        HashMap<String, String> m1 = new HashMap<>();
        HashMap<String, String> m2 = new HashMap<>();
        Map<String, String[]> expected = new HashMap<>();

        m1.put("fond", "enamored");
        m1.put("outfit", "garb");


        m2.put("fond", "averse");
        m2.put("outfit", null);

        expected.put("fond", new String[]{"enamored", "averse"});
        expected.put("outfit", new String[]{"garb", null});

        Map<String, String[]> result = LeftJoin.leftJoinMaps(m1,m2);
        assertEquals( expected.keySet(), result.keySet());
    }


}
