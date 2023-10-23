/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teammaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Asad
 */
public class TeamNameMaker {
    enum TeamName {
        //Names of the teams
        Gladiator, Tiger, Dolphin, King, Aplha, Echo, Dubliner, Pioneer, Titan, Dragon, Wild, Sultan, Delta, Juliet, Romeo, Tango, Golf, Polo, Chilli, Bravo 
    }
    private List<TeamName> availableNames; //A list to store available team nams
    
    
    public TeamNameMaker() {
        availableNames = new ArrayList<>(Arrays.asList(TeamName.values()));
        
    }
    /*
    * @Get a random team name from the available names 
    * @return A random TeamName from the available names
    * @throws IllegalStateExceptions if there are no available team names
    */
    public TeamName getRandomTeamName() {
        if (availableNames.isEmpty()) {
           throw new IllegalStateException("No available team names");
        }
        int randomIndex = ThreadLocalRandom.current().nextInt(availableNames.size());
        return availableNames.remove(randomIndex);//Remove and return random team name
    }
}
