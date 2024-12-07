package software.ulpgc.model.api;

import software.ulpgc.model.Language;
import software.ulpgc.model.Translation;

public interface TranslationLoader {
    Translation load(String text, Language language);
}
