package software.ulpgc.model.api;

import software.ulpgc.model.Language;

public interface TranslationReader {
    String read(String text, Language language);
}
