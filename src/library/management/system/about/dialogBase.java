package library.management.system.about;

import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public  class dialogBase extends AnchorPane {

    protected final Pane pane;
    protected final DropShadow dropShadow;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final Label label5;
    protected final Label label6;
    protected final Label label7;
    protected final Label label8;
    protected final Label label9;
    protected final Label label10;
    protected final Separator separator;

    public dialogBase() {

        pane = new Pane();
        dropShadow = new DropShadow();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        label5 = new Label();
        label6 = new Label();
        label7 = new Label();
        label8 = new Label();
        label9 = new Label();
        label10 = new Label();
        separator = new Separator();

        setId("AnchorPane");
        setPrefHeight(442.0);
        setPrefWidth(586.0);
        setStyle("-fx-background-color: white;");

        pane.setPrefHeight(65.0);
        pane.setPrefWidth(586.0);
        pane.setStyle("-fx-background-color: #1976d2;");

        dropShadow.setHeight(9.0);
        dropShadow.setRadius(1.75);
        dropShadow.setWidth(0.0);
        pane.setEffect(dropShadow);

        label.setLayoutX(14.0);
        label.setLayoutY(5.0);
        label.setPrefHeight(56.0);
        label.setPrefWidth(311.0);
        label.setText("About Library Management System");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font("Lato Regular", 19.0));

        label0.setLayoutX(486.0);
        label0.setLayoutY(14.0);
        label0.setPrefHeight(38.0);
        label0.setPrefWidth(86.0);
        label0.setText("Acorp.Inc");
        label0.setTextFill(javafx.scene.paint.Color.WHITE);
        label0.setFont(new Font("Lato Regular", 20.0));

        label1.setLayoutX(33.0);
        label1.setLayoutY(83.0);
        label1.setPrefHeight(38.0);
        label1.setPrefWidth(117.0);
        label1.setText("Product Name");
        label1.setFont(new Font("Lato Regular", 14.0));

        label2.setLayoutX(180.0);
        label2.setLayoutY(83.0);
        label2.setPrefHeight(38.0);
        label2.setPrefWidth(227.0);
        label2.setText("Library Management System");
        label2.setFont(new Font("Lato Regular", 14.0));

        label3.setLayoutX(33.0);
        label3.setLayoutY(121.0);
        label3.setPrefHeight(38.0);
        label3.setPrefWidth(117.0);
        label3.setText("Product Version");
        label3.setFont(new Font("Lato Regular", 14.0));

        label4.setLayoutX(180.0);
        label4.setLayoutY(121.0);
        label4.setPrefHeight(38.0);
        label4.setPrefWidth(227.0);
        label4.setText("LMS Version 1.0.0");
        label4.setFont(new Font("Lato Regular", 14.0));

        label5.setLayoutX(33.0);
        label5.setLayoutY(159.0);
        label5.setPrefHeight(38.0);
        label5.setPrefWidth(117.0);
        label5.setText("Build Information");
        label5.setFont(new Font("Lato Regular", 14.0));

        label6.setLayoutX(180.0);
        label6.setLayoutY(159.0);
        label6.setPrefHeight(38.0);
        label6.setPrefWidth(117.0);
        label6.setText("Version 1.0.0");
        label6.setFont(new Font("Lato Regular", 14.0));

        label7.setLayoutX(180.0);
        label7.setLayoutY(197.0);
        label7.setPrefHeight(38.0);
        label7.setPrefWidth(289.0);
        label7.setText("Java version  10.0.1+10, Oracle Corporation");
        label7.setFont(new Font("Lato Regular", 14.0));

        label8.setLayoutX(33.0);
        label8.setLayoutY(234.0);
        label8.setPrefHeight(38.0);
        label8.setPrefWidth(117.0);
        label8.setText("Operating System");
        label8.setFont(new Font("Lato Regular", 14.0));

        label9.setLayoutX(180.0);
        label9.setLayoutY(234.0);
        label9.setPrefHeight(38.0);
        label9.setPrefWidth(217.0);
        label9.setText("Windows 10  intel i3");
        label9.setFont(new Font("Lato Regular", 14.0));

        label10.setAlignment(javafx.geometry.Pos.CENTER);
        label10.setLayoutX(211.0);
        label10.setLayoutY(375.0);
        label10.setPrefHeight(38.0);
        label10.setPrefWidth(227.0);
        label10.setText("Copyright (c) 2018-2019, Acorp.Inc");
        label10.setFont(new Font("Lato Regular", 14.0));

        separator.setLayoutX(46.0);
        separator.setLayoutY(158.0);
        separator.setPrefHeight(0.0);
        separator.setPrefWidth(502.0);

        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        getChildren().add(pane);
        getChildren().add(label1);
        getChildren().add(label2);
        getChildren().add(label3);
        getChildren().add(label4);
        getChildren().add(label5);
        getChildren().add(label6);
        getChildren().add(label7);
        getChildren().add(label8);
        getChildren().add(label9);
        getChildren().add(label10);
        getChildren().add(separator);

    }
}
