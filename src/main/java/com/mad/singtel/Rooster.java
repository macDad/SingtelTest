package com.mad.singtel;

import com.mad.singtel.helper.SingHelper;
import com.mad.singtel.utils.enmus.SoundEnums;

public class Rooster extends Chicken {
    public Rooster() {
        super(new SingHelper(SoundEnums.ROOSTER));
    }
}
