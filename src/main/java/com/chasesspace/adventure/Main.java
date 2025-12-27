package com.chasesspace.adventure;

import java.util.List;
import java.util.Scanner;

import com.chasesspace.adventure.engine.Command;
import com.chasesspace.adventure.engine.CommandParser;
import com.chasesspace.adventure.engine.WeaponLoader;
import com.chasesspace.adventure.entity.Weapon;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println( "Welcome to the Adventure Game!" );

        // Load weapon configurations from external JSON resource
        List<Weapon> weapons = WeaponLoader.loadWeapons();
        
        boolean running = true;
        
        // ----- Game loop -----
        // Take input
        // Process input
        // Update game state
        // Render output
        // Repeat
        while (running) {
            // Take input
            System.out.print("> ");
            String input = in.nextLine();

            // Process input
            if (input.equalsIgnoreCase("quit")) {
                running = false;
                System.out.println("Thanks for playing!");
            } else {
                Command command = CommandParser.parseCommand(input);

                if (command != null) {
                    String[] commandArgs = input.split(" ");
                    command.execute(commandArgs);
                } else {
                    System.out.println("Unknown command: " + input);
                }
                // Update game state
                // Render output
            }
            
        }

        in.close();
    }
}
