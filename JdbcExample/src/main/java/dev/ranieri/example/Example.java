package dev.ranieri.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// JDBC Java Database Connectivity. The Java API responsible for communicating with databases
public class Example {


    public static void main(String[] args) {

        try {
            // it really bad practice to directly store credentials in code
            // "jdbc:postgresql://ranieri-sql-server.postgres.database.azure.com:5432/postgres?user=adamGator&password=gatorfan99!!&ssl=false"
            Connection conn = DriverManager.getConnection(System.getenv("AZURE_SQL_DB"));
            System.out.println(conn);

            Statement statement = conn.createStatement();
            statement.execute("insert into player values (606,'Billy','bobson',1000)");

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
