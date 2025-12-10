package com.chasesspace.adventure.entity;

import com.chasesspace.adventure.engine.Dice;

public class Weapon extends Item {
    private Dice damageDie;

    public Weapon(String name, String description, Dice damageDie) {
        super(name, description);
        this.damageDie = damageDie;
    }

    public int getDamage() {
        return damageDie.rollDice();
    }

}
