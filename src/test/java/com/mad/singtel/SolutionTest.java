package com.mad.singtel;

import com.mad.singtel.rest.api.*;
import com.mad.singtel.rest.api.helper.SingHelper;
import com.mad.singtel.rest.api.miscellaneous.AnimalCount;
import com.mad.singtel.rest.api.utils.enmus.LanguageEnums;
import com.mad.singtel.rest.api.utils.enmus.SoundEnums;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;


class SolutionTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SolutionTest.class);

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeAll
    public static void setUp() {
        System.out.println("@BeforAll - Executes");
    }

    @BeforeEach
    public void init() {
        System.out.println("@BeforeEach - Executes");
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void walk() {

        new Bird().canWalk();
        assertThat(outContent.toString(), containsString("I am walking"));
        new Chicken().canWalk();
        assertThat(outContent.toString(), containsString("I am walking"));
        new Duck().canWalk();
        assertThat(outContent.toString(), containsString("I am walking"));
        new Rooster().canWalk();
        assertThat(outContent.toString(), containsString("I am walking"));
        new Butterfly().canWalk();
        assertThat(outContent.toString(), containsString("I am walking"));
    }

    @Test
    void fly() {
        new Duck().canFly();
        assertThat(outContent.toString(), containsString("flying"));
        new Parrot().canFly();
        assertThat(outContent.toString(), containsString("flying"));
        new Butterfly().canFly();
        assertThat(outContent.toString(), containsString("flying"));

        new Butterfly().canFly();
        assertThat(outContent.toString(), containsString("I cant Fly"));
        new Butterfly().transform();

        new Butterfly().canFly();
        assertThat(outContent.toString(), containsString("flying"));
    }

    @Test
    void sing() {
        new Bird().callSound();
        assertThat(outContent.toString(), containsString("I am singing"));
        new Duck().callSound();
        assertThat(outContent.toString(), containsString("Quack, quack"));
        new Chicken().callSound();
        assertThat(outContent.toString(), containsString("Cluck, cluck"));

        new Chicken(new SingHelper(SoundEnums.CHICKEN)).callSound();
        assertThat(outContent.toString(), containsString("Cluck, cluck"));
        new Rooster().callSound();
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));
        new Rooster(LanguageEnums.DANISH).callSound();
        assertThat(outContent.toString(), containsString("kykyliky"));

        new Dog(new SingHelper(SoundEnums.DOG)).callSound();
        assertThat(outContent.toString(), containsString("Woof, woof"));
        new Cat(new SingHelper(SoundEnums.CAT)).callSound();
        assertThat(outContent.toString(), containsString("Meow"));

        new Parrot().callSound();
        assertThat(outContent.toString(), containsString("I am singing"));
        new Parrot(new SingHelper(SoundEnums.DOG)).callSound();
        assertThat(outContent.toString(), containsString("Woof, woof"));
        new Parrot(new SingHelper(SoundEnums.CAT)).callSound();
        assertThat(outContent.toString(), containsString("Meow"));
        new Parrot(new SingHelper(SoundEnums.ROOSTER)).callSound();
        assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));

        new Butterfly().callSound();
        assertThat(outContent.toString(), containsString("caterpillar"));
        new Butterfly().transform();
        new Butterfly().callSound();
        assertThat(outContent.toString(), containsString(""));


    }

    @Test
    void swim() {
        new Duck().canSwim();
        assertThat(outContent.toString(), containsString("I am swimming"));
        new Fish().canSwim();
        assertThat(outContent.toString(), containsString("I am swimming"));
        new Dolphin().canSwim();
        assertThat(outContent.toString(), containsString("I am swimming"));
    }


    @Test
    void bodyColor() {
        assertEquals(new Fish().bodyColor(), null);
        assertEquals(new Shark().bodyColor(), "grey");
        assertEquals(new Clownfish().bodyColor(), "orange");

    }

    @Test
    void bodySize() {
        assertEquals(new Fish().bodySize(), null);
        assertEquals(new Shark().bodySize(), "large");
        assertEquals(new Clownfish().bodySize(), "small");
    }

    @Test
    void extraFishTest() {
        new Shark().canEat();
        assertThat(outContent.toString(), containsString("I eat fish"));
        new Clownfish().makeJoke();
        assertThat(outContent.toString(), containsString("I make jokes"));
    }

    @Test
    void CountingAnimals() {

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
        AnimalCount animalCount = new AnimalCount(animals);

        assertEquals(animalCount.getFlyingAnimal(), 6);
        assertEquals(animalCount.getWalkingAnimal(), 9);
        assertEquals(animalCount.getSpeakingAnimal(), 9);
        assertEquals(animalCount.getSwimingAnimal(), 6);


    }

}