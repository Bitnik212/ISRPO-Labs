import java.util.HashMap;
import java.util.Map;

public class Translator {
    /**
     * Задание 1
     * Используя IntelliJ IDEA, создайте класс Translator.
     * Напишите программу русско-английский переводчик. Программа знает 10 слов о погоде.
     * Требуется, чтобы пользователь вводил слово на русском языке, а программа давала ему перевод этого слова на английском языке.
     * Если пользователь ввел слово, для которого отсутствует перевод, то следует вывести сообщение, что такого слова нет.
     * **/

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
