package com.mad.singtel.miscellaneous;

import com.mad.singtel.Animal;
import com.mad.singtel.behaviors.Flyable;
import com.mad.singtel.behaviors.Speakable;
import com.mad.singtel.behaviors.Swimmable;
import com.mad.singtel.behaviors.Walkable;

public class AnimalCount {
    Animal[] animals;
    int flyingAnimal = 0;
    int walkingAnimal = 0;
    int speakingAnimal = 0;
    int swimingAnimal = 0;


    public AnimalCount(Animal[] animals) {
        this.animals = animals;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Flyable) {
                flyingAnimal += 1;
            }
            if (animals[i] instanceof Walkable) {
                walkingAnimal += 1;
            }
            if (animals[i] instanceof Speakable) {
                speakingAnimal += 1;
            }
            if (animals[i] instanceof Swimmable) {
                swimingAnimal += 1;
            }
        }
    }

    public int getFlyingAnimal() {
        return flyingAnimal;
    }

    public void setFlyingAnimal(int flyingAnimal) {
        this.flyingAnimal = flyingAnimal;
    }

    public int getWalkingAnimal() {
        return walkingAnimal;
    }

    public void setWalkingAnimal(int walkingAnimal) {
        this.walkingAnimal = walkingAnimal;
    }

    public int getSpeakingAnimal() {
        return speakingAnimal;
    }

    public void setSpeakingAnimal(int speakingAnimal) {
        this.speakingAnimal = speakingAnimal;
    }

    public int getSwimingAnimal() {
        return swimingAnimal;
    }

    public void setSwimingAnimal(int swimingAnimal) {
        this.swimingAnimal = swimingAnimal;
    }
}
