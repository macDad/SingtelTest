package com.mad.singtel;

import com.mad.singtel.behaviors.Speakable;
import com.mad.singtel.behaviors.Walkable;
import com.mad.singtel.utils.Constant;

public class Bird extends Animal implements Walkable, Speakable {


    public void callSound(String sound) {
        System.out.println(sound);
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }


}
