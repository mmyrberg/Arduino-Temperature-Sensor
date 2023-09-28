package com.example.thymeleaf;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Repo {
    List<Temps> getValues() throws IOException {
        Properties p = new Properties();
        p.load(new FileInputStream("C:\\Övrigt\\Thymeleaf_demo\\src\\main\\resources\\application.properties"));
        try (
                Connection c = DriverManager.getConnection(
                        p.getProperty("connectionstring"),
                        p.getProperty("username"),
                        p.getProperty("password"));
                Statement stmt = c.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM temp ORDER BY created_date DESC LIMIT 10");
        ) {

            List<Temps> temperature = new ArrayList<>();
            while (rs.next()) {
                Temps vals = new Temps();
                float temp = rs.getFloat("temperature");
                vals.setTemp(temp);
                int id = rs.getInt("id");
                vals.setId(id);
                String date = rs.getString("created_date");
                vals.setDate(date);
                temperature.add(vals);
            }

            return temperature;

        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
