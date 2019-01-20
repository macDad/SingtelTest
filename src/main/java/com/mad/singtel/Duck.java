package com.mad.singtel;

import com.mad.singtel.behaviors.Flyable;
import com.mad.singtel.behaviors.Swimmable;
import com.mad.singtel.helper.SingHelper;
import com.mad.singtel.utils.Constant;
import com.mad.singtel.utils.enmus.SoundEnums;

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
