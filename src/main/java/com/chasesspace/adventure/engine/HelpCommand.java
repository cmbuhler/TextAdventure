package com.chasesspace.adventure.engine;

public class HelpCommand implements Command {
    @Override
    public String getName() {
        return "help";
    }

    @Override
    public void execute(String[] args) {
        if (args.length > 1) {
            String topic = args[1];
            switch (topic.toLowerCase()) {
                case "commands":
                    listCommands();
                    break;
                default:
                    displayHelp();
            }
        } else {
            displayHelp();
        }
    }

    private void displayHelp() {
        System.out.println("\nThis is the help section. Here you can find information about how to play the game.");
        System.out.println("Available commands: help, inventory, search, ... (other commands would be listed here)\n");

    }

    private void listCommands() {
        System.out.println("\nList of available commands:");

        CommandParser.getCommands().forEach(command -> {
            System.out.println("- " + command.getName() + ": " + command.getDescription());
        });
        
        System.out.println("");
        // Add other commands here
    }

    @Override
    public String getDescription() {
        return "Provides help information about the game and its commands.";
    }
    
}
