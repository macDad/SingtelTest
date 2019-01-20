package com.mad.singtel.rest.api;

import com.mad.singtel.rest.api.utils.Constant;

public class Shark extends Fish {


    @Override
    public String bodySize() {
        return "large";
    }

    @Override
    public String bodyColor() {
        return "grey";
    }

    public void canEat() {
        System.out.println(Constant.I_EAT_FISH);
    }
}
