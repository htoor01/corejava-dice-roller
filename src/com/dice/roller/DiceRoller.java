package com.dice.roller;

import java.util.Random;

public class DiceRoller {

    // Declare global variables (instances) of random and number
    Random random;
    int number;

    // DiceRoller constructor
    DiceRoller(){
        // Instance of random
        random = new Random();
        roll();
    }

    // Roll() method
    void roll(){
        number = random.nextInt(6)+1; // Add +1, because index of 6 means (0,1,2,3,4,5)
        System.out.println("The number that was rolled is "+number+".");
    }

}
