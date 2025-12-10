package com.chasesspace.adventure.engine;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

import com.chasesspace.adventure.engine.dice.D6;
import com.chasesspace.adventure.engine.dice.D8;
import com.chasesspace.adventure.engine.dice.Dice;
import com.chasesspace.adventure.entity.Weapon;

public class WeaponLoader {
    
    public static List<Weapon> loadWeapons() {
        List<Weapon> weapons = new ArrayList<>();
        
        try (InputStream is = WeaponLoader.class.getResourceAsStream("/weapons.json")) {
            String content = new String(is.readAllBytes());
            JSONArray jsonArray = new JSONArray(content);
            
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonWeapon = jsonArray.getJSONObject(i);
                String name = jsonWeapon.getString("name");
                String description = jsonWeapon.getString("description");
                String damage = jsonWeapon.getString("damage");
                
                Dice dice = parseDice(damage);
                weapons.add(new Weapon(name, description, dice));
            }
        } catch (Exception e) {
            System.err.println("Error loading weapons: " + e.getMessage());
        }
        
        return weapons;
    }
    
    private static Dice parseDice(String damageString) {
        // Parse "1d6", "1d8", "1d4" format
        String[] parts = damageString.toLowerCase().split("d"); // turns "1d6" into ["1", "6"]
        int diceCount = Integer.parseInt(parts[0]);
        int diceType = Integer.parseInt(parts[1]);
        
        switch (diceType) {
            // case 4:
            //     return new D4();
            case 6:
                return new D6(diceCount);
            case 8:
                return new D8(diceCount);
            default:
                return new D6(diceCount); // default to d6
        }
    }
}
