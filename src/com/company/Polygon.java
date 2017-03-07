package com.company;

/**
 * Created by dande on 14-2-2017.
 */
@SuppressWarnings("DefaultFileTemplate")
public class Polygon extends DrawingItem {
    private Point[] vertices;
    private double weight;
    private Point anchor;
    private double width;

    public Point[] getVertices() {
        return vertices;
    }

    public Polygon(Point[] vertices, double weight, Point anchor, double width, double height,Color color ) {
        this.vertices = vertices;
        this.weight = weight;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
        super.color = color;
    }

    public void setVertices(Point[] vertices) {
        this.vertices = vertices;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    private double height;

    public String toString(){
        return anchor.toString() + " Polygon " + color;
    }


}
