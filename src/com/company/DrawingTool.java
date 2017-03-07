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


        this.canvas = new Canvas();
        this.javaFxPaintable = new JavaFxPaintable(canvas.getGraphicsContext2D());
        this.drawing = new Drawing("dr");
        gp = canvas.getGraphicsContext2D();
        drawing.addDrawingItem(new Oval(new Point(10,10),50,50,1,Color.BLACK));

        //for (DrawingItem d :drawing.getItems()) {
        //    if(d.getClass() == Oval.class){
        //        canvas.getGraphicsContext2D().strokeOval(d.getAnchor().getX(),d.getAnchor().getY(),d.getWidth(),d.getHeight());
        //    }
        //}
        Scene scene = new Scene(root, 400,400);
        gp.strokeOval(12,12,12,12);

        root.getChildren().add(canvas);
        primaryStage.setScene(scene);
        primaryStage.show();

        //ik commit deze shit
    }


}
