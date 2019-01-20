package com.mad.singtel;

import com.mad.singtel.helper.SingHelper;
import com.mad.singtel.utils.enmus.SoundEnums;

public class Cat extends Mammal {
    public Cat() {
        super(new SingHelper(SoundEnums.CAT));
    }

    public Cat(SingHelper singHelper) {
        super(singHelper);
    }
}
