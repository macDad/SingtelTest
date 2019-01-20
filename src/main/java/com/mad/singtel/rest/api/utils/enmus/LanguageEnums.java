package com.mad.singtel.rest.api.utils.enmus;

public enum LanguageEnums {
    DANISH("kykyliky"),
    DUTCH("kukeleku"),
    FINNISH("kukko kiekuu"),
    FRENCH("cocorico"),
    GERMAN("kikeriki"),
    GREEK("kikiriki"),
    HEBREW("coo-koo-ri-koo"),
    HUNGARIAN("kukuriku"),
    ITALIAN("chicchirichi"),
    JAPANESE("ko-ke-kok-ko-o"),
    PORTUGUESE("cucurucu"),
    RUSSIAN("kukareku"),
    SWEDISH("kuckeliku"),
    TURKISH("kuk-kurri-kuuu"),
    URDU("kuklooku");

    private String language;

    LanguageEnums(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }
}
