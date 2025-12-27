package com.chasesspace.adventure.engine.dice;

import java.util.concurrent.ThreadLocalRandom;

public class D8 extends Dice {
    public D8(int count) {
        super(count);
    }

    @Override
    public int rollDie() {
        return (int)(ThreadLocalRandom.current().nextDouble() * 8) + 1;
    }
}
