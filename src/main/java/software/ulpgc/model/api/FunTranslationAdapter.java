package software.ulpgc.model.api;

import software.ulpgc.model.Language;
import software.ulpgc.model.Translation;
import software.ulpgc.model.api.pojo.FunTranslationGetResponse;

public class FunTranslationAdapter implements TranslationAdapter{
    @Override
    public Translation adapt(Object responseObject) {
        return new Translation(
                getResponseContent(responseObject).text(),
                getResponseContent(responseObject).translated(),
                Language.ofName(getResponseContent(responseObject).translation())
        );
    }

    public FunTranslationGetResponse.Content getResponseContent(Object responseObject) {
        return ((FunTranslationGetResponse) responseObject).contents();
    }
}
