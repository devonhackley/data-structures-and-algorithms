package challenges.leftjoin;

import java.util.HashMap;
import java.util.Map;

public class LeftJoin {
    public static Map<String, String[]> leftJoinMaps(HashMap<String, String> map1, HashMap<String, String> map2) {
        HashMap<String, String []> result = new HashMap<>();
        if(map1 != null){
            // put contents into result
           for(String key : map1.keySet()){
               String[] resultContents = new String[2];
               resultContents[0] = map1.get(key).toLowerCase();
               resultContents[1] = map2.containsKey(key.toLowerCase()) ? map2.get(key.toLowerCase()) : null;
               result.put(key.toLowerCase(), resultContents);
           }

        }
        return result;
    }
}
