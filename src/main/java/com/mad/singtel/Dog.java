package com.mad.singtel;

import com.mad.singtel.helper.SingHelper;
import com.mad.singtel.utils.enmus.SoundEnums;

public class Dog extends Mammal {
    public Dog() {
        super((new SingHelper(SoundEnums.DOG)));
    }

    public Dog(SingHelper singHelper) {
        super(singHelper);
    }
}
