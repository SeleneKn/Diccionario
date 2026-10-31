package ejercicio.traductor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class QuizEngine {

    private final TranslationProvider translationProvider;

    public QuizEngine(TranslationProvider translationProvider) {
        this.translationProvider = translationProvider;
    }

    public void launchQuiz() {
        Scanner input = new Scanner(System.in);
        Map<String, String> wordsMap = translationProvider.getWords();
        List<String> spanishList = new ArrayList<>(wordsMap.keySet());
        Collections.shuffle(spanishList);

        int hits = 0;
        int misses = 0;
        int totalQuestions = 5;

        for (int i = 0; i < totalQuestions; i++) {
            String word = spanishList.get(i);
            System.out.print("¿Cómo se dice \"" + word + "\" en inglés? ");
            String answer = input.nextLine().trim();
            String expected = wordsMap.get(word);

            if (answer.equalsIgnoreCase(expected)) {
                System.out.println("¡Correcto!");
                hits++;
            } else {
                System.out.println("Incorrecto. La traducción correcta es: " + expected);
                misses++;
            }
            System.out.println();
        }

        System.out.println("--- Resultados ---");
        System.out.println("Aciertos: " + hits);
        System.out.println("Errores: " + misses);

        input.close();
    }
}
