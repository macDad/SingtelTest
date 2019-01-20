package com.mad.singtel;

import com.mad.singtel.Animal;
import com.mad.singtel.behaviors.Swimmable;
import com.mad.singtel.utils.Constant;

public class Fish extends Animal implements Swimmable {
    public void canSwim() {
        System.out.println(Constant.I_AM_SWIMMING);
    }
}
