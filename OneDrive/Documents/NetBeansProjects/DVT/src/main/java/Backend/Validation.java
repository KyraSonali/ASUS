/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

/**
 *
 * @author Kyra Balliram
 */
public class Validation {
    
     //CHECKS IF THE NUMBER CONTAINS ANY CHARACTERS
    public boolean checkDigit(String id) {
        boolean checkID = true; //Does not contain letters
        char c = 'a';

        for (int i = 0; i < id.length(); i++) {
            c = id.charAt(i);

            if (!Character.isDigit(c)) { //checks if there is a character
                checkID = false;
            }
        }
        return checkID;
    }

    
}
