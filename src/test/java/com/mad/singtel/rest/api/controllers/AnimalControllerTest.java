package com.mad.singtel.rest.api.controllers;

import com.mad.singtel.rest.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalControllerTest {
    @Test
    void getFlyingAnimalCount() {
        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                new Butterfly(),
                new Cat()
        };
        int flyingAnimalCount = new AnimalController().getFlyingAnimalCount(animals);
        assertEquals(flyingAnimalCount, 6);
    }

}