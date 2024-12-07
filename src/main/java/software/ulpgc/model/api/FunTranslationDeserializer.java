package software.ulpgc.model.api;

import com.google.gson.Gson;
import software.ulpgc.model.api.pojo.FunTranslationGetResponse;

public class FunTranslationDeserializer implements TranslationDeserializer{
    @Override
    public Object deserialize(String jsonResponse) {
        return new Gson().fromJson(jsonResponse, FunTranslationGetResponse.class);
    }
}
