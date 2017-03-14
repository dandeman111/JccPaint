package com.company;

import java.util.Properties;

/**
 * Created by dande on 14-3-2017.
 */
public class SerializationMediator implements PersistencyMediator {

    private Properties props;

    public SerializationMediator(Properties props) {
        this.props = props;
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
