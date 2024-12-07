package software.ulpgc.model.api.pojo;

public record FunTranslationGetResponse(ResponseType success, Content contents) {
    public record ResponseType(int total){}
    public record Content(String translated, String text, String translation){}
}
