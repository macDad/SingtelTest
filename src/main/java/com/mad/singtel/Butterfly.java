package com.mad.singtel;

import com.mad.singtel.behaviors.Flyable;
import com.mad.singtel.behaviors.Walkable;
import com.mad.singtel.utils.Constant;

public class Butterfly extends Animal implements Flyable,Walkable{
    public void canFly() {
        System.out.println(Constant.I_AM_FLYING);
    }

    public void canWalk() {
        System.out.println(Constant.I_AM_WALKING);
    }
}
