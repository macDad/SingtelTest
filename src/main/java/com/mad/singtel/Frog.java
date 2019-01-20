package com.mad.singtel;

import com.mad.singtel.behaviors.Speakable;
import com.mad.singtel.behaviors.Swimmable;
import com.mad.singtel.behaviors.Walkable;
import com.mad.singtel.helper.SingHelper;
import com.mad.singtel.utils.Constant;
import com.mad.singtel.utils.enmus.SoundEnums;

public class Frog extends Animal implements Swimmable, Walkable, Speakable {
    SingHelper singHelper;

    public Frog() {
        singHelper = new SingHelper(SoundEnums.DEFAULT);
    }

    public Frog(SingHelper singHelper) {
        singHelper = singHelper;
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
