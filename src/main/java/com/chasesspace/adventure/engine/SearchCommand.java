package com.chasesspace.adventure.engine;

public class SearchCommand implements Command {
    @Override
    public String getName() {
        return "search";
    }

    @Override
    public void execute(String[] args) {
        // Logic to search the current location or an item
        System.out.println("You search the area. (Search results would be shown here.)");
    }

    @Override
    public String getDescription() {
        return "Searches the current location.";
    }
    
}
