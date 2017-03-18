package com.company;

import java.util.Properties;
import java.io.*;

/**
 * Created by dande on 14-3-2017.
 */
public class SerializationMediator implements PersistencyMediator {

    private Properties props;

    public SerializationMediator(String filename) {
        props = new Properties();
        props.setProperty("fileName",filename);
    }


    @Override
    public Drawing load(String nameFile) {
        Drawing d = null;

        try{
            FileInputStream fileIn = new FileInputStream(nameFile);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            d = (Drawing) in.readObject();
            in.close();
            fileIn.close();
            return d;
        }catch (IOException i){
            i.printStackTrace();
            return d;
        }catch (ClassNotFoundException c){
            System.out.println("Drawing class not found");
            c.printStackTrace();
            return d;
        }

    }

    @Override
    public boolean save(Drawing drawing) {
        try{
            FileOutputStream fileOut = new FileOutputStream(props.getProperty("fileName"));
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(drawing);
            out.close();
            fileOut.close();
            return true;
        }catch (IOException i){
            i.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean init(Properties props) {
        this.props = props;
        return true;
    }
}
