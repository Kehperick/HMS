package library.management.system.help;

import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

public  class Help extends AnchorPane {

    protected final Pane pane;
    protected final DropShadow dropShadow;
    protected final Label label;
    protected final Hyperlink hyperlink;
    protected final Label label0;
    protected final Label label1;

    public Help() {

        pane = new Pane();
        dropShadow = new DropShadow();
        label = new Label();
        hyperlink = new Hyperlink();
        label0 = new Label();
        label1 = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(335.0);
        setPrefWidth(576.0);

        pane.setPrefHeight(61.0);
        pane.setPrefWidth(576.0);
        pane.setStyle("-fx-background-color: #1976d2;");

        dropShadow.setColor(javafx.scene.paint.Color.web("#b9b9b9"));
        dropShadow.setHeight(9.0);
        dropShadow.setOffsetY(2.0);
        dropShadow.setRadius(1.75);
        dropShadow.setWidth(0.0);
        pane.setEffect(dropShadow);

        label.setLayoutX(53.0);
        label.setLayoutY(10.0);
        label.setPrefHeight(39.0);
        label.setPrefWidth(125.0);
        label.setText("Help");
        label.setTextFill(javafx.scene.paint.Color.WHITE);
        label.setFont(new Font("Lato Regular", 33.0));

        hyperlink.setLayoutX(6.0);
        hyperlink.setLayoutY(168.0);
        hyperlink.setPrefHeight(31.0);
        hyperlink.setPrefWidth(564.0);
        hyperlink.setText("Http://www.acorpinc.com/home/products/librarymanagementsystem.html");
        hyperlink.setFont(new Font("Lato Regular", 18.0));

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setLayoutX(196.0);
        label0.setLayoutY(115.0);
        label0.setPrefHeight(46.0);
        label0.setPrefWidth(185.0);
        label0.setText("Visit");
        label0.setFont(new Font("Lato Regular", 36.0));

        label1.setAlignment(javafx.geometry.Pos.CENTER);
        label1.setLayoutX(43.0);
        label1.setLayoutY(199.0);
        label1.setPrefHeight(88.0);
        label1.setPrefWidth(493.0);
        label1.setText("for more information and help concerning usage and documentations");
        label1.setWrapText(true);
        label1.setFont(new Font("Lato Regular", 15.0));

        pane.getChildren().add(label);
        getChildren().add(pane);
        getChildren().add(hyperlink);
        getChildren().add(label0);
        getChildren().add(label1);

    }
}
