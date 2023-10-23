/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teammaker;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Asad
 */ 
public class TeamMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Person> people = new ArrayList<>();//Creating a list to store person objects
        List<Team> teams = new ArrayList<>();//Creating a list to store team objects
        Set<Integer> userIds = new HashSet<>();//Creating a set to track users ids 
        
          try (BufferedReader reader = new BufferedReader(new FileReader("MOCK_data.csv"))){
            String line;
            //Reading data from CSV file line by line
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(",");//spliting the line into parts using comma as a delimiter
                int id = Integer.parseInt(parts[0]); //Extracting the person's id
                String firstName = parts[1];//Extracting the person's first name
                String lastName = parts[2];//Extracting the person's last name 
                String email = parts[3];//Extracting the person's email
                people.add(new Person(id, firstName, lastName, email));//Creating a person object and add it to list
            }
            
        } catch (IOException e){
            e.printStackTrace(); //Handle and prints any exceptions related to file I/O
        }
        Collections.shuffle(people); //shuffle the list of people to randomize team assignments
        TeamNameMaker nameMaker = new TeamNameMaker();// Creating a teamNameMaker insatnce
        
            for ( int i = 1; i <= 20; i++){
            TeamNameMaker.TeamName randomTeamName = nameMaker.getRandomTeamName();//Getting a randomize team name
            Team team = new Team("Team " + i + ":" + randomTeamName.name()); //creating a new team with a name
            
            for (int j = 0; j < 5; j++){
                if (people.isEmpty()) {
                break;  //if there are no more people to add, exit the loop 
            }
            
            
            
            int randomIndex = ThreadLocalRandom.current().nextInt(people.size());//Generating a random index within the range of available people
            Person person = people.remove(randomIndex);//Removing a person from the list of available people
          
            
            if (userIds.add(person.id)){
                team.members.add(person);//Adding the person to the team if their id is not already used
            }
            
        }
              teams.add(team);//Adding the team to the list of teams
           }
            for(Team team : teams){
              System.out.println(team);//Printing each team's information
}
    
}

}