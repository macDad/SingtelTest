package com.mad.singtel.rest.api;

import com.mad.singtel.rest.api.behaviors.Swimmable;
import com.mad.singtel.rest.api.utils.Constant;

public class Dolphin extends Animal implements Swimmable {
    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
