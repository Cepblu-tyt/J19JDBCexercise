package controllers;

import db.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Grades {

    static Connection connection = Database.DbConn();
    static PreparedStatement ps;
    static ResultSet rs;
    static Scanner scanner = new Scanner(System.in);


    public static boolean createGradesTable() {
        try {
            ps = connection.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS grades(" +
                            "   id serial PRIMARY KEY, " +
                            "   student_id int , " +
                            "   score float NOT NULL," +
                            "   grade int, " +
                            "   FOREIGN KEY(student_id) REFERENCES students(id))");

            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}
