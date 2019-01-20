package com.mad.singtel;

import com.mad.singtel.behaviors.Flyable;
import com.mad.singtel.behaviors.Swimmable;
import com.mad.singtel.utils.Constant;

public class Duck extends Bird implements Swimmable, Flyable {


    @Override
    public void callSound(String sound) {
        super.callSound(sound);
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
