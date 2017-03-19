package com.company;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * Created by dande on 14-3-2017.
 */
public class DatabaseMediator implements PersistencyMediator {
    private Properties props;
    private Connection con;

    private static final String SQL_SERIALIZE_OBJECT = "INSERT INTO drawingobject(drawingName, drawingBlob) VALUES (?, ?)";
    private static final String SQL_DESERIALIZE_OBJECT = "SELECT drawingBlob FROM drawingobject WHERE drawingname = ?";

    public DatabaseMediator(String conString,String password) {


    }

    private void closeConnection(){
    }

    private void initConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jcc-shapes","student","student");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Drawing load(String nameDrawing) {
        initConnection();
        try{
            PreparedStatement pstmt = con.prepareStatement(SQL_DESERIALIZE_OBJECT);
            pstmt.setString(1,nameDrawing);
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            byte[] buf = rs.getBytes(1);
            ObjectInputStream objectIn = null;
            if(buf != null){
                objectIn = new ObjectInputStream(new ByteArrayInputStream(buf));
            }
            Drawing deserializedDrawing = (Drawing) objectIn.readObject();

            rs.close();
            pstmt.close();

            System.out.println(deserializedDrawing.toString());

            return deserializedDrawing;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }catch (IOException i){
            i.printStackTrace();
            return null;
        }catch (ClassNotFoundException c){
            c.printStackTrace();
            return null;
        }


    }

    @Override
    public boolean save(Drawing drawing){
        initConnection();
        try{
            PreparedStatement pstmt = con.prepareStatement(SQL_SERIALIZE_OBJECT);

            pstmt.setString(1,drawing.getName());
            pstmt.setObject(2,drawing);
            pstmt.executeUpdate();
        } catch (SQLException i){
            i.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean init(Properties props) {
        return false;
    }
}
