package software.ulpgc.model.api;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import software.ulpgc.model.Language;

import java.io.IOException;

public class FunTranslationReader implements TranslationReader {
    public static final String apiUrl = "https://api.funtranslations.com/translate/";
    @Override
    public String read(String text, Language language) {
        try {
            return readApi(text, language);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String readApi(String text, Language language) throws IOException {
        Connection.Response response = Jsoup.connect(getEndpointUrl(text, language.name()))
                .ignoreContentType(true)
                .method(Connection.Method.GET)
                .execute();

        if (response.statusCode() != 200) throw new IOException("Error");
        return response.body();
    }

    private String getEndpointUrl(String text, String languageName){
        return apiUrl + languageName + "?text=" + text;
    }
}
