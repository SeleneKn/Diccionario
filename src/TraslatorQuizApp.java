import ejercicio.traductor.QuizEngine;
import ejercicio.traductor.TranslationProvider;
import ejercicio.traductor.WordRepository;

public class TraslatorQuizApp {
    public static void main(String[] args) {
        TranslationProvider provider = new WordRepository();
        QuizEngine engine = new QuizEngine(provider);
        engine.launchQuiz();
    }
}