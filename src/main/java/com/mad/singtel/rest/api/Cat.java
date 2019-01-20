package com.mad.singtel.rest.api;

import com.mad.singtel.rest.api.helper.SingHelper;
import com.mad.singtel.rest.api.utils.enmus.SoundEnums;

public class Cat extends Mammal {
    public Cat() {
        super(new SingHelper(SoundEnums.CAT));
    }

    public Cat(SingHelper singHelper) {
        super(singHelper);
    }
}
