package com.mad.singtel.rest.api;

import com.mad.singtel.rest.api.behaviors.Flyable;
import com.mad.singtel.rest.api.behaviors.Speakable;
import com.mad.singtel.rest.api.behaviors.Walkable;
import com.mad.singtel.rest.api.helper.SingHelper;
import com.mad.singtel.rest.api.utils.Constant;

public class Insect extends Animal implements Flyable, Walkable, Speakable {
    private SingHelper singHelper;

    public Insect(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }

    public void callSound() {
        singHelper.makeSound();
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
