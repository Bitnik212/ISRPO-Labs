import java.util.HashMap;
import java.util.Map;

public class Translator {

    private final HashMap<String, String> dict = new HashMap<>(Map.of("", ""));

    public Translator() {
        this.dict.put("слово", "word");
        this.dict.put("арбуз", "watermelon");
        this.dict.put("ягода", "berry");
        this.dict.put("ананас", "pineapple");
    }

    public String translate(String word){
        return this.dict.get(word);
    }

}
