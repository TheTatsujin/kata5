import software.ulpgc.model.Language;
import software.ulpgc.model.Translation;
import software.ulpgc.model.api.*;

public class Main {
    public static void main(String[] args) {
        TranslationLoader loader = new FunTranslationLoader(
                new FunTranslationReader(),
                new FunTranslationDeserializer(),
                new FunTranslationAdapter()
        );

        Translation translation = loader.load(
                "Hello my name is Luis, I like programming and Ice Cream",
                Language.Shakespeare
        );

        System.out.println(translation);
    }
}
