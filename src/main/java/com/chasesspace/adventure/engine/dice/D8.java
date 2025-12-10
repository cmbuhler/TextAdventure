package com.chasesspace.adventure.engine.dice;

public class D8 extends Dice {
    public D8(int count) {
        super(count);
    }

    @Override
    public int rollDie() {
        return (int)(Math.random() * 8) + 1;
    }
}
