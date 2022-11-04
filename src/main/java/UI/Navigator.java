/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BACKEND.UserManager;
import java.sql.SQLException;


/**
 *
 * @author Kyra Balliram
 */

public class Navigator {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        UserManager m = new UserManager();
        new EntryScreen(m).setVisible(true);

    }
}
