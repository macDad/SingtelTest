package com.mad.singtel;

import com.mad.singtel.behaviors.Speakable;
import com.mad.singtel.behaviors.Walkable;
import com.mad.singtel.helper.SingHelper;
import com.mad.singtel.utils.Constant;
import com.mad.singtel.utils.enmus.SoundEnums;

public class Bird extends Animal implements Walkable, Speakable {

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


}
