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
     graphics.strokeOval(oval.getAnchor().getX(),oval.getAnchor().getY(),oval.getWidth(),oval.getHeight());
    }

    @Override
    public void paint(Polygon polygon) {
      graphics.strokePolygon(polygon.getX(),polygon.getY(),polygon.getVertices().length);
    }

    @Override
    public void paint(PaintedText text) {
      graphics.strokeText(text.getContent(),text.getAnchor().getX(),text.getAnchor().getY());
    }

    @Override
    public void paint(Image image) {

    }
}
