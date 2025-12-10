package com.chasesspace.adventure.engine;

public class AttackCommand implements Command {
    @Override
    public String getName() {
        return "attack";
    }

    @Override
    public void execute(String[] args) {
        // Implementation for attack command
        System.out.println("You attack the enemy!");
    }

    @Override
    public String getDescription() {
        return "Attacks an enemy with your equipped weapon.";
    }
    
}
