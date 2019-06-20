import java.util.HashMap;
import java.util.Map;

public class WordsOccurences {
    public static void main(String[] args) {
        String str= "this is enquero company "+"this is a good company and well organized";
        Map<String,Integer> StringOccurences=new HashMap<>();
        String[] words = str.split(" ");
        for(String word : words){
            Integer integer=StringOccurences.get(word);
            if(integer==null)
            {
                StringOccurences.put(word,1);
            }
            else{
                StringOccurences.put(word,integer+1);
            }
        }
        System.out.println(StringOccurences);
    }
}
