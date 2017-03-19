package com.company;

import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;

import java.awt.*;

/**
 * Created by dande on 21-2-2017.
 */
public class DrawingTool extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private Canvas canvas;
    private JavaFxPaintable javaFxPaintable;
    private Drawing drawing;
    private GraphicsContext gp;
    private PersistencyMediator pm;
    public DrawingTool() {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        StackPane root = new StackPane();

       // pm = new SerializationMediator("TEST1");
        pm = new DatabaseMediator("","");
        this.canvas = new Canvas(500,500);
        gp = canvas.getGraphicsContext2D();
        this.javaFxPaintable = new JavaFxPaintable(gp);
        this.drawing = new Drawing("Drawing Tool");
        Oval  oval = new Oval(new Point(10,10),50,50,1,Color.BLUE);
        Point[] points = new Point[3];
        points[0] = new Point(10,10);
        points[1] = new Point(50,190);
        points[2] = new Point(100,20);
        Polygon poly = new Polygon(points,1,points[0],1,1,Color.BLACK);

        PaintedText pt = new PaintedText("Content", "ComicSansMs",new Point(50 ,50),10, 10,Color.BLACK);

        drawing.addDrawingItem( oval);
        drawing.addDrawingItem(poly);
        drawing.addDrawingItem(pt);


        //pm.save(drawing);
        pm.load("Drawing Tool");
        //Drawing d1 = pm.load("TEST1");
        System.out.println("gemaakte tekening: " + drawing.toString());
        //System.out.println("geladen tekening: " + d1.toString());


        for (DrawingItem d :drawing.getItems()){
           d.paintUsing(javaFxPaintable);
        }

        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        primaryStage.setTitle("Drawing Tool");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
