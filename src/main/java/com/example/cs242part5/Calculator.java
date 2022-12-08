package com.example.cs242part5;

import java.util.*;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;

import static java.lang.Math.round;

public class Calculator extends Application {

    String calculation = new String();
    boolean solved = false;

    @Override
    public void start(Stage FullStage) {
        try {
            AnchorPane root = new AnchorPane();
            /** Setting up the buttons */
            Button button1 = new Button();
            button1.setText("1");
            button1.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            button1.setMinWidth(20);
            button1.setMinHeight(20);

            Button button2 = new Button();
            button2.setText("2");
            button2.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            button2.setMinWidth(20);
            button2.setMinHeight(20);

            Button button3 = new Button();
            button3.setText("3");
            button3.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            button3.setMinWidth(20);
            button3.setMinHeight(20);

            Button button4 = new Button();
            button4.setText("4");
            button4.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            button4.setMinWidth(20);
            button4.setMinHeight(20);

            Button button5 = new Button();
            button5.setText("5");
            button5.setStyle("-fx-background-color: white ; -fx-font-size: 20;");
            button5.setMinWidth(20);
            button5.setMinHeight(20);


            Button button6 = new Button();
            button6.setText("6");
            button6.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            button6.setMinWidth(20);
            button6.setMinHeight(20);

            Button button7 = new Button();
            button7.setText("7");
            button7.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            button7.setMinWidth(20);
            button7.setMinHeight(20);

            Button button8 = new Button();
            button8.setText("8");
            button8.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            button8.setMinWidth(20);
            button8.setMinHeight(20);

            Button button9 = new Button();
            button9.setText("9");
            button9.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            button9.setMinWidth(20);
            button9.setMinHeight(20);

            Button button0 = new Button();
            button0.setText("0");
            button0.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            button0.setMinWidth(20);
            button0.setMinHeight(20);

            Button clearButton = new Button();
            clearButton.setText("C");
            clearButton.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            clearButton.setMinWidth(20);
            clearButton.setMinHeight(20);


            Button divisionButton = new Button();
            divisionButton.setText("/");
            divisionButton.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            divisionButton.setMinWidth(20);
            divisionButton.setMinHeight(20);

            Button multiplyButton = new Button();
            multiplyButton.setText("*");
            multiplyButton.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            multiplyButton.setMinWidth(20);
            multiplyButton.setMinHeight(20);

            Button addButton = new Button();
            addButton.setText("+");
            addButton.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            addButton.setMinWidth(20);
            addButton.setMinHeight(20);

            Button subtractButton = new Button();
            subtractButton.setText("-");
            subtractButton.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            subtractButton.setMinWidth(20);
            subtractButton.setMinHeight(20);

            Button equalButton = new Button();
            equalButton.setText("=");
            equalButton.setStyle("-fx-background-color: white; -fx-font-size: 20;");
            equalButton.setMinWidth(20);
            equalButton.setMinHeight(20);

            /** Setting up the results field */

            TextField resultsField = new TextField("0");
            resultsField.setMinSize(250,75);
            resultsField.getStyleClass().add(".textfield");

            /** Setting button positions */

            button0.setLayoutX(10);
            button0.setLayoutY(320);

            equalButton.setLayoutX(73);
            equalButton.setLayoutY(320);

            clearButton.setLayoutX(140);
            clearButton.setLayoutY(320);

            button1.setLayoutX(10);
            button1.setLayoutY(250);

            button2.setLayoutX(75);
            button2.setLayoutY(250);

            button3.setLayoutX(140);
            button3.setLayoutY(250);

            button4.setLayoutX(10);
            button4.setLayoutY(180);

            button5.setLayoutX(75);
            button5.setLayoutY(180);

            button6.setLayoutX(140);
            button6.setLayoutY(180);

            button7.setLayoutX(10);
            button7.setLayoutY(110);

            button8.setLayoutX(75);
            button8.setLayoutY(110);

            button9.setLayoutX(140);
            button9.setLayoutY(110);

            addButton.setLayoutX(200);
            addButton.setLayoutY(110);

            subtractButton.setLayoutX(200);
            subtractButton.setLayoutY(180);

            multiplyButton.setLayoutX(200);
            multiplyButton.setLayoutY(250);

            divisionButton.setLayoutX(200);
            divisionButton.setLayoutY(320);

            resultsField.setLayoutX(0);
            resultsField.setLayoutY(20);

            /** Add the buttons */
            root.getChildren().addAll(button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,addButton,clearButton,divisionButton,equalButton,multiplyButton,subtractButton,resultsField);

            /** All event handlers for the buttons
             *  Conditions are present to clear the results field if equals has already been pressed (math solved)
             */
            button0.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (solved == true) {
                        solved = false;
                        calculation = "";
                        resultsField.setText(calculation);
                        calculation = calculation.concat("0");
                        resultsField.setText(calculation);

                    } else {
                        calculation = calculation.concat("0");
                        resultsField.setText(calculation);
                    }
                }
            });

            button1.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (solved == true) {
                        solved = false;
                        calculation = "";
                        resultsField.setText(calculation);
                        calculation = calculation.concat("1");
                        resultsField.setText(calculation);
                    }
                    else {
                        calculation = calculation.concat("1");
                        resultsField.setText(calculation);
                    }

                }
            });

            button2.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (solved == true) {
                        solved = false;
                        calculation = "";
                        resultsField.setText(calculation);
                        calculation = calculation.concat("2");
                        resultsField.setText(calculation);
                    }
                    else {
                        calculation = calculation.concat("2");
                        resultsField.setText(calculation);
                    }
                }
            });

            button3.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (solved == true) {
                        solved = false;
                        calculation = "";
                        resultsField.setText(calculation);
                        calculation = calculation.concat("3");
                        resultsField.setText(calculation);
                    }
                    else {
                        calculation = calculation.concat("3");
                        resultsField.setText(calculation);
                    }
                }
            });

            button4.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (solved == true) {
                        solved = false;
                        calculation = "";
                        resultsField.setText(calculation);
                        calculation = calculation.concat("4");
                        resultsField.setText(calculation);
                    }
                    else {
                        calculation = calculation.concat("4");
                        resultsField.setText(calculation);
                    }
                }
            });

            button5.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (solved == true) {
                        solved = false;
                        calculation = "";
                        resultsField.setText(calculation);
                        calculation = calculation.concat("5");
                        resultsField.setText(calculation);
                    }
                    else {
                        calculation = calculation.concat("5");
                        resultsField.setText(calculation);
                    }
                }
            });

            button6.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (solved == true) {
                        solved = false;
                        calculation = "";
                        resultsField.setText(calculation);
                        calculation = calculation.concat("6");
                        resultsField.setText(calculation);
                    }
                    else {
                        calculation = calculation.concat("6");
                        resultsField.setText(calculation);
                    }
                }
            });

            button7.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (solved == true) {
                        solved = false;
                        calculation = "";
                        resultsField.setText(calculation);
                        calculation = calculation.concat("7");
                        resultsField.setText(calculation);
                    }
                    else {
                        calculation = calculation.concat("7");
                        resultsField.setText(calculation);
                    }
                }
            });

            button8.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (solved == true) {
                        solved = false;
                        calculation = "";
                        resultsField.setText(calculation);
                        calculation = calculation.concat("8");
                        resultsField.setText(calculation);
                    }
                    else {
                        calculation = calculation.concat("8");
                        resultsField.setText(calculation);
                    }
                }
            });

            button9.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (solved == true) {
                        solved = false;
                        calculation = "";
                        resultsField.setText(calculation);
                        calculation = calculation.concat("9");
                        resultsField.setText(calculation);
                    }
                    else {
                        calculation = calculation.concat("9");
                        resultsField.setText(calculation);
                    }
                }
            });

            addButton.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (solved == true) {
                        solved = false;
                        calculation = "";
                        resultsField.setText(calculation);
                        calculation = calculation.concat(" + ");
                        resultsField.setText(calculation);
                    }
                    else {
                        calculation = calculation.concat(" + ");
                        resultsField.setText(calculation);
                    }
                }
            });

            clearButton.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = "";
                    resultsField.setText(calculation);
                }
            });

            divisionButton.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (solved == true) {
                        solved = false;
                        calculation = "";
                        resultsField.setText(calculation);
                        calculation = calculation.concat(" / ");
                        resultsField.setText(calculation);
                    }
                    else {
                        calculation = calculation.concat(" / ");
                        resultsField.setText(calculation);
                    }
                }
            });

            multiplyButton.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (solved == true) {
                        solved = false;
                        calculation = "";
                        resultsField.setText(calculation);
                        calculation = calculation.concat(" * ");
                        resultsField.setText(calculation);
                    }
                    else {
                        calculation = calculation.concat(" * ");
                        resultsField.setText(calculation);
                    }
                }
            });


            subtractButton.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    if (solved == true) {
                        solved = false;
                        calculation = "";
                        resultsField.setText(calculation);
                        calculation = calculation.concat(" - ");
                        resultsField.setText(calculation);
                    }
                    else {
                        calculation = calculation.concat(" - ");
                        resultsField.setText(calculation);
                    }
                }
            });

            equalButton.addEventFilter( MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                public void handle(MouseEvent me) {
                    calculation = calculate(calculation,"eq");
                    resultsField.setText(calculation);
                    solved = true;
                }
            });


            resultsField.addEventFilter( KeyEvent.KEY_RELEASED, new EventHandler<KeyEvent>() {
                public void handle( KeyEvent ke ) {
                    if(ke.getCode() == KeyCode.ENTER){
                        calculation = calculate(calculation,"eq");
                        resultsField.setText(calculation);
                    }
                    else{
                        calculation = resultsField.getText();
                    }

                }
            });
            /** Set up the scene */
            Scene scene = new Scene(root, 250, 400);
            FullStage.setScene(scene);
            FullStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String calculate(String input, String operation){
        try {
            /** Take in inputs from scanner */
            Scanner inScanner = new Scanner(input);
            int arg3 = 0;
            int arg1 = inScanner.nextInt();

            if (operation == "eq") {
                while (inScanner.hasNext()) {
                    operation = inScanner.next();
                    Integer arg2 = inScanner.nextInt();
                    /** Check operation, calcuate, and return the formatted result */
                    if (operation.contains("-")) {
                        arg3 = arg1 - arg2;
                        return "" + Integer.toString(arg1) + " - " + Integer.toString(arg2) + " = " + Integer.toString(arg3) + "";
                    } else if (operation.contains("+")) {
                        arg3 = arg1 + arg2;
                        return "" + Integer.toString(arg1) + " + " + Integer.toString(arg2) + " = " + Integer.toString(arg3) + "";
                    } else if (operation.contains("*")) {
                        arg3 = arg1 * arg2;
                        return "" + Integer.toString(arg1) + " * " + Integer.toString(arg2) + " = " + Integer.toString(arg3) + "";
                    } else if (operation.contains("/")) {
                        arg3 = round(((float) arg1 / (float) arg2));
                        return "" + Integer.toString(arg1) + " / " + Integer.toString(arg2) + " = " + Integer.toString(arg3) + "";
                    }
                }
            }
            /** Default case; this shouldn't be returned */
            return Integer.toString(arg3);
        }catch(Exception e){
            return "ERROR";
        }
    }

    public static void main(String[] args) { launch(args); }
}