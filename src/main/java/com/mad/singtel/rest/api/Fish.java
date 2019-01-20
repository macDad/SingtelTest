package com.mad.singtel.rest.api;

import com.mad.singtel.rest.api.behaviors.BodyType;
import com.mad.singtel.rest.api.behaviors.Swimmable;
import com.mad.singtel.rest.api.utils.Constant;

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
