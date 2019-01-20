package com.mad.singtel;

import com.mad.singtel.behaviors.Flyable;
import com.mad.singtel.helper.SingHelper;
import com.mad.singtel.utils.Constant;
import com.mad.singtel.utils.enmus.SoundEnums;

public class Parrot extends Bird implements Flyable {
    public Parrot() {
        super(new SingHelper(SoundEnums.DEFAULT));
    }

    public Parrot(SingHelper singHelper) {
        super(singHelper);
    }

    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }
}
