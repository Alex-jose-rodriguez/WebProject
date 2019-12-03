package dao.services;

import dao.people.User;

import java.sql.*;

public class ManagementDB extends User{
    private boolean openconnection;

    public boolean isOpenConnection(){
        return openconnection;
    }




    private final String base = "user"; //Nombre de tabla
    private final String url = "jdbc:mysql://localhost:3306/" + base;

    private Connection con = null;





    /*private String user = "root";
    private String pwd = "MySQL";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pwd);
        } catch (ClassNotFoundException e) {
            System.err.println("Problem with connection drivers");
        } catch (SQLException e) {
            System.err.println("Problem with connection drivers");
        }
        return con;
    }*/
}



