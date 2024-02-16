package HashTable.DesignHashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _648_Replace_Words {

    public static String replaceWords(List<String> dictionary, String sentence) {
        String[] str = sentence.split(" ");

        Set<String> mySet = new HashSet<>();
        
        for (String s : dictionary){
            mySet.add(s);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                String prefix = str[i].substring(0, j + 1);
                if (mySet.contains(prefix)){
                    str[i] = prefix;
                    break;
                }
            }

            if (!sb.isEmpty()){
                sb.append(" ");
            }
            sb.append(str[i]);

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");

        String sentence = "the cattle was rattled by the battery";

        System.out.println(replaceWords(dictionary, sentence));

    }

}
