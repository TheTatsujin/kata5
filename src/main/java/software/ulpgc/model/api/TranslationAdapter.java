package software.ulpgc.model.api;

import software.ulpgc.model.Translation;

public interface TranslationAdapter {
    Translation adapt(Object responseObject);
}
