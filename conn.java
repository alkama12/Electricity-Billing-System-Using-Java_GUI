package Electricity;

import java.sql.DriverManager;
import java.sql.*;

//--------------------------------Conn Class to create connection to DataBase-----------------------


public class conn{
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project1?serverTimezone=UTC","root","");
            s = c.createStatement();
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}