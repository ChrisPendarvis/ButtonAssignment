package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;



/**
 * JavaFX App
 */
public class ButtonAssignment extends Application {
    TextField tf;
    TextField tf2;
    Label label;
    @Override
    public void start(Stage stage) {

        label = new Label("");
        label.setText("" );
        label.setLayoutX(350); label.setLayoutY(50);

        Button btn1 = new Button("Click me!");
        btn1.setLayoutX(50);
        btn1.setLayoutY(50);
        btn1.setOnAction( v -> {
            label.setText("I clicked this button - " + ((Button)v.getSource()).getText());
        });

        Button btn2 = new Button("Button 2");
        btn2.setLayoutX(350);
        btn2.setLayoutY(0);
        btn2.setOnAction( this::processBtn2 );

        tf = new TextField("");
        tf.setLayoutX(150); tf.setLayoutY(50);

        tf2 = new TextField("");
        tf2.setLayoutX(150); tf.setLayoutY(50);

        Group gp = new Group(label, btn2, tf, tf2);


        var scene = new Scene(gp, 640, 480);
        stage.setScene(scene);
        stage.setTitle("GUI Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private void processBtn2(ActionEvent arg0){
        String cntnt = tf.getText().trim();
        String cntnt2 = tf2.getText().trim();
        int nm = Integer.parseInt(cntnt);
        int nm2 = Integer.parseInt(cntnt2);
        label.setText("" + (nm + nm2));
        label.setTextFill(Color.BLUE);
    }

}

