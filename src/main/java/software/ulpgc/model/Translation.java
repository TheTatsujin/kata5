package software.ulpgc.model;

public record Translation(String original, String translated, Language language) {
    @Override
    public String toString() {
        return "Original text: " + original + "\n"
                + "Translated text: " + translated + "\n"
                + "Language: " + language.toString();
    }
}
