/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teammaker;

/**
 *
 * @author Asad
 */
public class Person {
    int id; //integer to store the person's id
    String firstName; //string to store the person's first name
    String lastName;//string to store the person's last name
    String email;//string to store the person's email

    //Constructor to create a new person object with the provided information
    public Person(int id, String firstName, String lastName, String email) {
        this.id = id; //initializing the person's id with provided id
        this.firstName = firstName;//initializing the person's first name with provided first name
        this.lastName = lastName;//initializing the person' last name with provided last name
        this.email = email;//initializing the person's email with provided email
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + email + ")";
        //Return a string that combines the first name, last name, and email in a specific format
    }
    
    
}
