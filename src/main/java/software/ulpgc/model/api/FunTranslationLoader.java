package software.ulpgc.model.api;

import software.ulpgc.model.Language;
import software.ulpgc.model.Translation;

public class FunTranslationLoader implements TranslationLoader {
    private final TranslationReader reader;
    private final TranslationDeserializer deserializer;
    private final TranslationAdapter adapter;

    public FunTranslationLoader(TranslationReader reader, TranslationDeserializer deserializer, TranslationAdapter adapter) {
        this.reader = reader;
        this.deserializer = deserializer;
        this.adapter = adapter;
    }

    @Override
    public Translation load(String text, Language language) {
        return adapter.adapt(deserializer.deserialize(reader.read(text, language)));
    }
}
