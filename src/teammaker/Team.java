/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teammaker;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asad
 */
public class Team {
    String name; //String to store the name of the team
    List<Person> members;//List to store the members of the team
    
    //Constructor to create a new team object with the provided information
    public Team(String name) {
        this.name = name;//Initialize the team's name with the provided inforamtion
        this.members = new ArrayList<>();//Create a new arraylist to store team members
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();//Creating a string builder to build the output string
        builder.append("Team: ").append(name).append("\n"); //Append the team's name to the output string
        
        for (Person member : members) {
            builder.append(" - ").append(member.toString()).append("\n");
            //Append each team member's information in the specified format to the output string
        }
        return builder.toString();//Return the complete string representation of the team
    }
    
    
}
