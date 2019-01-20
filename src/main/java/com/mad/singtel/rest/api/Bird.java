package com.mad.singtel.rest.api;

import com.mad.singtel.rest.api.behaviors.Flyable;
import com.mad.singtel.rest.api.behaviors.Speakable;
import com.mad.singtel.rest.api.behaviors.Walkable;
import com.mad.singtel.rest.api.helper.SingHelper;
import com.mad.singtel.rest.api.utils.Constant;
import com.mad.singtel.rest.api.utils.enmus.SoundEnums;

public class Bird extends Animal implements Walkable, Speakable, Flyable {

    private SingHelper singHelper;

    public Bird() {
        this.singHelper = new SingHelper(SoundEnums.DEFAULT);
    }

    public Bird(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }


    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }
}
