package com.mad.singtel.rest.api.utils.enmus;

public enum SoundEnums {
    DUCK("Quack, quack"),
    CHICKEN("Cluck, cluck"),
    ROOSTER("Cock-a-doodle-doo"),
    DOG("Woof, woof"),
    CATERPILLAR("caterpillar"),
    CAT("Meow"),
    DEFAULT("I am singing"),
    NO_SOUND("");
    private String sound;

    SoundEnums(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
