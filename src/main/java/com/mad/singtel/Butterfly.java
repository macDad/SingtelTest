package com.mad.singtel;

import com.mad.singtel.behaviors.Flyable;
import com.mad.singtel.behaviors.NotFlyable;
import com.mad.singtel.behaviors.NotSpeakable;
import com.mad.singtel.behaviors.Speakable;
import com.mad.singtel.helper.SingHelper;
import com.mad.singtel.utils.Constant;
import com.mad.singtel.utils.enmus.SoundEnums;

public class Butterfly extends Insect {
    private Insect state = new caterpillarState(new SingHelper(SoundEnums.CATERPILLAR));

    public Butterfly() {
        super(new SingHelper(SoundEnums.CATERPILLAR));
    }

    void transform() {
        state = new ButterflyState(new SingHelper(SoundEnums.NO_SOUND));
    }

    @Override
    public void canFly() {
        state.canFly();
    }

    @Override
    public void callSound() {
        state.callSound();
    }

    @Override
    public void canWalk() {
        state.canWalk();
    }

    private class ButterflyState extends Insect implements Flyable, NotSpeakable {

        public ButterflyState(SingHelper singHelper) {
            super(singHelper);
        }

        @Override
        public void callSound() {
            super.callSound();
        }

        @Override
        public void canFly() {
            super.canFly();
        }
    }

    private class caterpillarState extends Insect implements Speakable, NotFlyable {

        public caterpillarState(SingHelper singHelper) {
            super(singHelper);

        }

        @Override
        public void callSound() {
            super.callSound();
        }

        @Override
        public void canFly() {
            System.out.println(Constant.I_CANT_FLY);
        }
    }
}
