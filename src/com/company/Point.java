package com.company;

/**
 * Created by dande on 14-2-2017.
 */
@SuppressWarnings("DefaultFileTemplate")
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString(){
        return "X :" + x +" Y: "+ y;
    }
}
