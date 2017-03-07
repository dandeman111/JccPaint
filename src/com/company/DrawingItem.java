package com.company;

/**
 * Created by dande on 14-2-2017.
 */
@SuppressWarnings("DefaultFileTemplate")
public abstract class DrawingItem {
    protected Color color;
    protected DrawingItem previousState;

    //getters setters
    public DrawingItem getPreviousState() {
        return previousState;
    }

    public void paintUsing(Paintable paintable){

    }

    public void setPreviousState(DrawingItem previousState) {
        this.previousState = previousState;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    abstract public Point getAnchor();
    abstract public double getWidth();
    abstract public double getHeight();

}
