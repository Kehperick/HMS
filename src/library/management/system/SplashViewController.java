/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Keh Perick
 */
public class SplashViewController implements Initializable {

    @FXML
    private StackPane rootPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        new SplashScreen().start();
    }   
    
    class SplashScreen extends Thread{

        @Override
        public void run() {
            try {
                System.out.println("Loading the main scene.This might take a while");
                
                Thread.sleep(5000);
                System.out.println("Done loading");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(SplashViewController.class.getName()).log(Level.SEVERE, null, ex);
                }
                Platform.runLater(() -> {
                    Parent root= null;
                    try {
                        root = FXMLLoader.load(getClass().getResource("Login.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(SplashViewController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    Scene scene = new Scene(root);
                    Stage stage =new Stage();
                    stage.setScene(scene);
                    stage.initStyle(StageStyle.DECORATED);
                    stage.getIcons().add(new Image(LibraryManagementSystem.class.getResourceAsStream("icons/image.png")));
                    
                    
                    stage.show();
                    
                    rootPane.getScene().getWindow().hide();
                });
            } catch (InterruptedException ex) {
                Logger.getLogger(SplashViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
        
    
}
    
}




















