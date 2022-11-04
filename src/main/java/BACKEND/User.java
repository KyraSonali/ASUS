/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND;

/**
 *
 * @author Kyra Balliram
 */
public class User {

    private int userID;
    private String userFirstname;
    private String userSurname;
    private String userPassword;
    private String username;

    public User(int inUserID, String inPassword, String inUserFirstname, String inUserSurname, String genName) {
        userID = inUserID;
        userPassword = inPassword;
        userFirstname = inUserFirstname;
        userSurname = inUserSurname;
        username = genName;

    }

   

    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserFirstname() {
        return userFirstname;
    }

    public String getUserSurname() {
        return userSurname;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", userPassword=" + userPassword + '}';
    }

}
