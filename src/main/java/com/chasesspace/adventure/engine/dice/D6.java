package com.chasesspace.adventure.engine.dice;

import java.util.concurrent.ThreadLocalRandom;

public class D6 extends Dice {
    public D6(int count) {
        super(count);
    }

    @Override
    public int rollDie() {
        return (int)(ThreadLocalRandom.current().nextDouble() * 6) + 1;
    }
}
