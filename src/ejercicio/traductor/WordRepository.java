package ejercicio.traductor;

import java.util.HashMap;
import java.util.Map;

public class WordRepository implements TranslationProvider {
    private final Map<String, String> vocabulary;

    public WordRepository() {
        vocabulary = new HashMap<>();
        vocabulary.put("sol", "sun");
        vocabulary.put("luna", "moon");
        vocabulary.put("estrella", "star");
        vocabulary.put("cielo", "sky");
        vocabulary.put("árbol", "tree");
        vocabulary.put("flor", "flower");
        vocabulary.put("pájaro", "bird");
        vocabulary.put("pez", "fish");
        vocabulary.put("caballo", "horse");
        vocabulary.put("montaña", "mountain");
        vocabulary.put("playa", "beach");
        vocabulary.put("río", "river");
        vocabulary.put("mar", "sea");
        vocabulary.put("rojo", "red");
        vocabulary.put("azul", "blue");
        vocabulary.put("verde", "green");
        vocabulary.put("tiempo", "time");
        vocabulary.put("trabajo", "work");
        vocabulary.put("dinero", "money");
        vocabulary.put("llave", "key");
    }

    @Override
    public Map<String, String> getWords() {
        return vocabulary;
    }
}
