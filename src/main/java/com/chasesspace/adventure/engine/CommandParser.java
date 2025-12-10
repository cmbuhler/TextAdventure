package com.chasesspace.adventure.engine;

import java.util.List;

public class CommandParser {
    private static List<Command> commands = getDefaultCommands();

    public static Command parseCommand(String input) {
        String[] parts = input.split(" ");
        String commandName = parts[0];
        for (Command command : commands) {
            if (command.getName().equalsIgnoreCase(commandName)) {
                return command;
            }
        }
        return null; // Command not found
    }

    public static void RegisterCommand(Command command) {
        commands.add(command);
    }

    public static void UnregisterCommand(Command command) {
        commands.remove(command);
    }

    public static List<Command> getDefaultCommands() {
        return List.of(
            new SearchCommand(),
            new InventoryCommand(),
            new AttackCommand(),
            new HelpCommand()
        );
    }

    public static List<Command> getCommands() {
        return commands;
    }
}
