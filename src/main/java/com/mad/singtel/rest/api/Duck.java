package com.mad.singtel.rest.api;

import com.mad.singtel.rest.api.behaviors.Flyable;
import com.mad.singtel.rest.api.behaviors.Swimmable;
import com.mad.singtel.rest.api.helper.SingHelper;
import com.mad.singtel.rest.api.utils.Constant;
import com.mad.singtel.rest.api.utils.enmus.SoundEnums;

public class Duck extends Bird implements Swimmable, Flyable {

    public Duck() {
        super(new SingHelper(SoundEnums.DUCK));
    }

    @Override
    public void canWalk() {
        super.canWalk();
    }

    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }

    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
