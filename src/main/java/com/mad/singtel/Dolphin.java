package com.mad.singtel;

import com.mad.singtel.behaviors.Swimmable;
import com.mad.singtel.utils.Constant;

public class Dolphin extends Animal implements Swimmable {
    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
