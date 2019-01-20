package com.mad.singtel.rest.api;

import com.mad.singtel.rest.api.behaviors.NotFlyable;
import com.mad.singtel.rest.api.helper.SingHelper;
import com.mad.singtel.rest.api.utils.Constant;
import com.mad.singtel.rest.api.utils.enmus.SoundEnums;

public class Chicken extends Bird implements NotFlyable {
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

    @Override
    public void canFly() {
        System.out.println(Constant.I_CANT_FLY);
    }
}
