package com.company;

import java.util.Properties;

/**
 * Created by dande on 14-3-2017.
 */
public interface PersistencyMediator {
    Drawing load(String nameDrawing);
    boolean save(Drawing drawing);
    boolean init(Properties props);
}
