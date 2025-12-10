package com.chasesspace.adventure.engine.dice;

public abstract class Dice {
    private int count;

    public Dice(int count) {
        this.count = count;
    }

    public Dice() {
        this.count = 1;
    }

    public int rollDice() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += rollDie();
        }
        return total;
    }

    abstract protected int rollDie();

    public int getCount() {
        return count;
    };
}
