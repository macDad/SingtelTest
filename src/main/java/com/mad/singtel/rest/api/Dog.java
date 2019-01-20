package com.mad.singtel.rest.api;

import com.mad.singtel.rest.api.helper.SingHelper;
import com.mad.singtel.rest.api.utils.enmus.SoundEnums;

public class Dog extends Mammal {
    public Dog() {
        super((new SingHelper(SoundEnums.DOG)));
    }

    public Dog(SingHelper singHelper) {
        super(singHelper);
    }
}
