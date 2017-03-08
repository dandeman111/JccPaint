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

        drawing.addDrawingItem( oval);

        javaFxPaintable.paint(oval);

        //for (DrawingItem d :drawing.getItems()) {
        //    if(d.getClass() == Oval.class){
        //        canvas.getGraphicsContext2D().strokeOval(d.getAnchor().getX(),d.getAnchor().getY(),d.getWidth(),d.getHeight());
        //    }
        //}

        javaFxPaintable.paint((Oval)drawing.getItems().get(0));
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);
        primaryStage.setTitle("Drawing Tool");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
