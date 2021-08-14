package org.example;

import com.mysql.cj.protocol.Resultset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyJDBC {

    public static void main( String[] args )
    {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-video", "root", "palembang");

            Statement statement = connection.createStatement();

            ResultSet resultset = statement.executeQuery("select * from people");

            while (resultset.next()) {
                System.out.println(resultset.getString("firstname"));
            }

        }catch(Exception e) {
            e.printStackTrace();
        }

    }
}



