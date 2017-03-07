package com.company;

/**
 * Created by dande on 14-2-2017.
 */
@SuppressWarnings("DefaultFileTemplate")
public class Oval extends DrawingItem {
    private Point anchor;
    private double width;
    private double height;
    private double weight;

    public Oval(Point anchor, double width, double height, double weight, Color color) {
        this.anchor = anchor;
        this.width = width;
        this.height = height;
        this.weight = weight;
        super.color = color;
    }

    @Override
    public Point getAnchor() {
        return anchor;
    }

    public void setAnchor(Point anchor) {
        this.anchor = anchor;
    }

    @Override
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString(){
        return anchor.toString() + " "+ color.toString() +" Oval" ;
    }
}
