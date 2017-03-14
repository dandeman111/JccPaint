package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by dande on 14-3-2017.
 */
public class DatabaseMediator implements PersistencyMediator {
    private Properties props;
    private Connection con;

    private void closeConnection(){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void initConnection(){
        //https://docs.oracle.com/javase/tutorial/jdbc/basics/connecting.html
    }

    @Override
    public Drawing load(String nameDrawing) {
        return null;
    }

    @Override
    public boolean save(Drawing drawing) {
        return false;
    }

    @Override
    public boolean init(Properties props) {
        return false;
    }
}
