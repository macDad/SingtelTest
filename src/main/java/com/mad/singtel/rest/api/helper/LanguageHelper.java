package com.mad.singtel.rest.api.helper;

import com.mad.singtel.rest.api.utils.enmus.LanguageEnums;
import com.mad.singtel.rest.api.utils.enmus.SoundEnums;

public class LanguageHelper {

    public static String translate(String sound, LanguageEnums translateTo) {

        if (translateTo == null || !sound.equals(SoundEnums.ROOSTER.getSound())) {
            System.out.println("Unable to translate sound: " + sound);
            return sound;
        }

        switch (translateTo) {
            case DANISH:
                return LanguageEnums.DANISH.getLanguage();
            case DUTCH:
                return LanguageEnums.DUTCH.getLanguage();
            case FINNISH:
                return LanguageEnums.FINNISH.getLanguage();
            case FRENCH:
                return LanguageEnums.FRENCH.getLanguage();
            case GERMAN:
                return LanguageEnums.GERMAN.getLanguage();
            case GREEK:
                return LanguageEnums.GREEK.getLanguage();
            case HEBREW:
                return LanguageEnums.HEBREW.getLanguage();
            case HUNGARIAN:
                return LanguageEnums.HUNGARIAN.getLanguage();
            case ITALIAN:
                return LanguageEnums.ITALIAN.getLanguage();
            case JAPANESE:
                return LanguageEnums.JAPANESE.getLanguage();
            case PORTUGUESE:
                return LanguageEnums.PORTUGUESE.getLanguage();
            case RUSSIAN:
                return LanguageEnums.RUSSIAN.getLanguage();
            case SWEDISH:
                return LanguageEnums.SWEDISH.getLanguage();
            case TURKISH:
                return LanguageEnums.TURKISH.getLanguage();
            case URDU:
                return LanguageEnums.URDU.getLanguage();
            default:
                System.out.println("Unable to translate to: " + translateTo);
                return sound;
        }

    }
}
