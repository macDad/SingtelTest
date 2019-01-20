package com.mad.singtel.utils.enmus;

public enum SoundEnums {
    DUCK("Quack, quack"),
    CHICKEN("Cluck, cluck"),
    ROOSTER("Cock-a-doodle-doo"),
    DOG("Woof, woof"),
    CAT("Meow"),
    DEFAULT("I am singing");
    private String sound;

    SoundEnums(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
