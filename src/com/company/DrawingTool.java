package com.company;

import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;

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
    public DrawingTool() {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        StackPane root = new StackPane();


        this.canvas = new Canvas(500,500);
        gp = canvas.getGraphicsContext2D();
        this.javaFxPaintable = new JavaFxPaintable(gp);
        this.drawing = new Drawing("Drawing Tool");
        Oval  oval = new Oval(new Point(10,10),50,50,1,Color.BLACK);
        Point[] points = new Point[3];
        points[0] = new Point(10,10);
        points[1] = new Point(20,10);
        points[2] = new Point(20,20);
        Polygon poly = new Polygon(points,1,points[0],1,1,Color.BLACK);

        drawing.addDrawingItem( oval);
        drawing.addDrawingItem(poly);

       // javaFxPaintable.paint(oval);

        for (DrawingItem d :drawing.getItems()) {
            if(d.getClass() == Oval.class){
                javaFxPaintable.paint((Oval)d);
            }else{
                if(d.getClass()== Polygon.class){
                    javaFxPaintable.paint((Polygon)d);
                }else{
                    if(d.getClass() == PaintedText.class){
                        javaFxPaintable.paint((PaintedText)d);
                    }
                }
            }

        }

        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        primaryStage.setTitle("Drawing Tool");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
