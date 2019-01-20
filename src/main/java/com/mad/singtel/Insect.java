package com.mad.singtel;

import com.mad.singtel.behaviors.FlyBehaviors;
import com.mad.singtel.behaviors.SpeakBehaviors;
import com.mad.singtel.behaviors.Walkable;
import com.mad.singtel.helper.SingHelper;
import com.mad.singtel.utils.Constant;

public class Insect extends Animal implements FlyBehaviors, Walkable, SpeakBehaviors {
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
