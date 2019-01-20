package com.mad.singtel;

import com.mad.singtel.behaviors.BodyType;
import com.mad.singtel.behaviors.Swimmable;
import com.mad.singtel.utils.Constant;

public class Fish extends Animal implements Swimmable, BodyType {
    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }

    public String bodySize() {
        return null;
    }

    public String bodyColor() {
        return null;
    }
}
