package com.gtg.function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteSQL {
    public static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private String url;
    private String user;
    private String password;
    Connection conn = null;
    Statement stmt = null;

    public void exec(String sql){
        try{
            Class.forName(DRIVER_NAME);
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            stmt.execute(sql);
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void close()  {
        try{
            stmt.close();
            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }

    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
