package com.mad.singtel.rest.api;

import com.mad.singtel.rest.api.behaviors.Speakable;
import com.mad.singtel.rest.api.behaviors.Swimmable;
import com.mad.singtel.rest.api.behaviors.Walkable;
import com.mad.singtel.rest.api.helper.SingHelper;
import com.mad.singtel.rest.api.utils.Constant;
import com.mad.singtel.rest.api.utils.enmus.SoundEnums;

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
