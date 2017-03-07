package com.company;

import java.io.File;

/**
 * Created by dande on 14-2-2017.
 */
@SuppressWarnings("DefaultFileTemplate")
public class Image extends DrawingItem{
    private File file;
    private Point anchor;
    private double width;
    private double height;

    @SuppressWarnings("SameParameterValue")
    public Image(Point anchor, double width, double height) {
        //this.file = file;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setAnchor(Point anchor) {
        this.anchor = anchor;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public Point getAnchor() {
        return anchor;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }
    public String toString(){
        return anchor.toString() + " Image ";
    }
}
