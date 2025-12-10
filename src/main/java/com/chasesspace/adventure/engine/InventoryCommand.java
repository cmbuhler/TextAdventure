package com.chasesspace.adventure.engine;

public class InventoryCommand implements Command {
    @Override
    public String getName() {
        return "inventory";
    }

    @Override
    public void execute(String[] args) {
        // Logic to display the player's inventory
        System.out.println("You check your inventory. (Inventory details would be shown here.)");
    }

    @Override
    public String getDescription() {
        return "Displays the items in your inventory.";
    }
}
