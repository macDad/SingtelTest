package com.mad.singtel;

import com.mad.singtel.helper.SingHelper;
import com.mad.singtel.utils.enmus.SoundEnums;

public class Chicken extends Bird {
    public Chicken() {
        super(new SingHelper(SoundEnums.CHICKEN));
    }

    public Chicken(SingHelper singHelper) {
        super(singHelper);
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }
}
