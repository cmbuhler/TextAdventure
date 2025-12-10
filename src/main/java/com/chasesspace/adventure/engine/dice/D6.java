package com.chasesspace.adventure.engine.dice;

public class D6 extends Dice {
    public D6(int count) {
        super(count);
    }

    @Override
    public int rollDie() {
        return (int)(Math.random() * 6) + 1;
    }
}
