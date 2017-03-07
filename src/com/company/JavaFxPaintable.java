package com.company;

import javafx.scene.canvas.GraphicsContext;

/**
 * Created by dande on 21-2-2017.
 */
public class JavaFxPaintable implements Paintable {

   private GraphicsContext graphics;

    public JavaFxPaintable(GraphicsContext graphics) {
        this.graphics = graphics;
    }

    @Override
    public void paint(Oval oval) {

    }

    @Override
    public void paint(Polygon polygon) {

    }

    @Override
    public void paint(PaintedText text) {

    }

    @Override
    public void paint(Image image) {

    }
}
