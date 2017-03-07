package com.company;

/**
 * Created by dande on 21-2-2017.
 */
@SuppressWarnings("DefaultFileTemplate")
public interface Paintable {
    void paint(Oval oval);
    void paint(Polygon polygon);
    void paint(PaintedText text);
    void paint(Image image);

}
