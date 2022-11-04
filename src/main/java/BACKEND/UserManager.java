/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND;

import BACKEND.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import BACKEND.User;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Kyra Balliram
 */
public class UserManager {

    private User currentUser;
    private User[] pArr = new User[100];

    private int size;
    private DB k;

    // private String username;
    public UserManager() throws ClassNotFoundException, SQLException {
        k = new DB();
        size = 0;

        String query = "SELECT * FROM kyrabDB.Users";
        try {
            ResultSet users = k.query(query);
            while (users.next()) {
                int id = users.getInt("UserID");
                String name = users.getString("Name");
                String surname = users.getString("Surname");
                String password = users.getString("Password");
                String username = users.getString("Username");
                pArr[size] = new User(id, password, name, surname, username);
                size++;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String toString() {
        String output = "";
        for (int i = 0; i < size; i++) {
            output += pArr[i] + "\n";
        }

        return output;
    }

    public boolean checkUser(String inUsername, String inPassword) {
        for (int i = 0; i < size; i++) {
            if (pArr[i].getUsername().equals(inUsername) && pArr[i].getUserPassword().equals(inPassword)) {
                //gets current user
                currentUser = pArr[i];
                return true;
            }

        }

        return false;
    }

    public int getCurrentUser() {
        int id = currentUser.getUserID();
        return id;
    }

    public void addUser(String name, String surname, String password) throws SQLException {
        //add user to databse
        String query = " INSERT INTO kyrabDB.Users (Name,Surname,Password) VALUES( '" + name + "','" + surname + "','" + password + "')";
        System.out.println(query);
        k.update(query);
        //retrieve generated query
        String getIdquery = "SELECT UserID\n" + "FROM kyrabDB.Users\n" + "WHERE Name='" + name + "' AND Surname='" + surname + "'";
        //move to next line
        ResultSet IDquery = k.query(getIdquery);
        IDquery.next();
        int userId = IDquery.getInt(1);
        //generate username
        String genUsername = "@" + name.charAt(0) + surname.charAt(0) + userId;
        String userUpper = genUsername.toUpperCase();
        //add generated username to db
        String updateQuery = "UPDATE kyrabDB.Users\n" + "SET Username ='" + userUpper + "'  WHERE UserId= '" + userId + "'";
        System.out.println(updateQuery);
        k.update(updateQuery);
        //update array
        pArr[size] = new User(userId, password, name, surname, genUsername);
        currentUser = pArr[size];
        size++;

    }

    public void addDiaryEntry(int userId, LocalDate date, String diaryContent, String diaryHeading) throws SQLException {
        String query = "INSERT INTO kyrabDB.JournalEntry ( UserId,Date,Entry,Title)"
                + " VALUES ( '" + userId + "','" + date + "','" + diaryContent + "','" + diaryHeading + "')";

        k.update(query);

    }

    public void OpenWebsite(String url) {
        Process p;
        try {
            p = Runtime.getRuntime().exec("cmd /c start " + url);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error:" + ex);
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void addMood(int inUserId, LocalDateTime inDate, int inSleepScore, int inMoodScore, int inExScore, int inEatingScore, String inActivities) throws SQLException {
        String query = "INSERT INTO kyrabDB.MoodScores (UserId,Date,SleepScore,MoodScore,ExerciseScore,EatingScore,Activities)"
                + " VALUES ( '" + inUserId + "','" + inDate + "','" + inSleepScore + "','" + inMoodScore + "','" + inExScore + "','" + inEatingScore + "','" + inActivities + "')";;

        k.update(query);
    }

    public String getUsername() {
        String username = currentUser.getUsername();
        return username;
    }

    public String getName() {
        String firstName = currentUser.getUserFirstname();
        String lastName = currentUser.getUserSurname();
        return firstName + " " + lastName;
    }

    public void genfunction(int currentUserId, int inMonth) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        //line graphs
        String funct1 = "mood";
        String funct2 = "sleep";
        String query = "SELECT date,SleepScore,MoodScore\n"
                + "FROM kyrabDB.MoodScores\n"
                + "Where UserId= '" + currentUserId + "'\n"
                + "AND MONTH(date) like'" + inMonth + "'\n";
        try {
            ResultSet data = k.query(query);
            while (data.next()) {
                //get values
                LocalDate n = data.getDate("Date").toLocalDate();
                int sleepScore = data.getInt("SleepScore");
                int moodScore = data.getInt("MoodScore");
                //add in loop
                dataset.addValue(moodScore, funct1, n);
                dataset.addValue(sleepScore, funct2, n);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in loading graph");
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        //build chart
        JFreeChart chart = ChartFactory.createLineChart("Pattern ", "Date", "Score", dataset, PlotOrientation.VERTICAL, true, true, true);
        ChartFrame frm = new ChartFrame("Pattern", chart);
        frm.setVisible(true);
        frm.setSize(600, 600);

    }

    public double getAvgDiet(int userId) throws SQLException {
        double avgDietOfYr;
        String query = "SELECT (SUM(EatingScore)/365)*100 As \"AvgDiet\"\n"
                + "FROM kyrabDB.MoodScores\n"
                + "WHERE Year(Date) = Year(curdate())\n"
                + "AND UserId='" + userId + "'\n";

        ResultSet avgDiet;
        avgDiet = k.query(query);
        avgDiet.next();
        avgDietOfYr = avgDiet.getLong("AvgDiet");

        return avgDietOfYr;
    }

    public int getAmountExercise(int userId) throws SQLException {
        int count;
        String q = "SELECT count(ExerciseScore) AS \"amountOfEx\"\n"
                + "FROM kyrabDB.MoodScores\n"
                + "WHERE Year(Date) = Year(curdate())\n"
                + "AND UserId='" + userId + "'\n";

        ResultSet numOfDays;
        numOfDays = k.query(q);
        numOfDays.next();
        count = numOfDays.getInt("amountOfEx");
        return count;
    }

    public ArrayList<String> getDateList(int userId) throws SQLException {
        String n;
        ArrayList<String> list = new ArrayList<>();
        String getDate = "SELECT Date\n"
                + " FROM kyrabDB.JournalEntry\n"
                + " Where UserId='" + userId + "'\n";

        ResultSet date;
        date = k.query(getDate);
        while (date.next()) {
            n = date.getDate("Date").toString();
            list.add(n);
        }

        return list;

    }

    public String getDiaryEntry(String date, int userId) throws SQLException {
        String query = "SELECT Entry \n"
                + "FROM kyrabDB.JournalEntry\n"
                + "Where UserId ='" + userId + "'\n"
                + "AND Date = '" + date + "'\n";
        ResultSet diary;
        diary = k.query(query);
        diary.next();
        String n = diary.getNString("Entry");
        return n;

    }

    public String getDiaryTitle(String date, int userId) throws SQLException {
        String query = "SELECT Title \n"
                + "FROM kyrabDB.JournalEntry\n"
                + "Where UserId ='" + userId + "'\n"
                + "AND Date = '" + date + "'\n";
        ResultSet diary;
        diary = k.query(query);
        diary.next();
        String m = diary.getNString("Title");

        return m;

    }

}
