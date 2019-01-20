package com.mad.singtel.rest.api.helper;

import com.mad.singtel.rest.api.utils.enmus.SoundEnums;

public class SingHelper {
    private SoundEnums soundEnums;

    public SingHelper(SoundEnums soundEnums) {
        this.soundEnums = soundEnums;
    }

    public void makeSound() {
        System.out.println(soundEnums.getSound());
    }
}
