package bank.management.system;

import java.sql.*;
import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/bankSystem","root","ROOT");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}