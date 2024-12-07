package software.ulpgc.model;

import java.util.Arrays;

public enum Language {
    Null(""),
    English("english"),
    Shakespeare("shakespeare"),
    Pirate("pirate"),
    OldEnglish("oldenglish");

    private final String name;
    Language(String name) {
        this.name = name;
    }

    public static Language ofName(String name) {
        return Arrays.stream(values())
                .filter(l -> l.name.equals(name))
                .findFirst()
                .orElse(Language.Null);
    }
}
