package challenges;

import challenges.hashtable.Hashtable;

public class RepeatedWord {

    public String findReapeatedWord(String str){
        String[] words = str.split(" ");
        Hashtable<String> table = new Hashtable<>();

        for(String word : words){
            String lw = word.toLowerCase();
            if(table.contains(lw)){
                return word;
            } else {
                table.add(lw, word);
            }
        }
        return "not found";
    }
}
