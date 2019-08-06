/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import library.management.system.helpers.Routes;
import library.management.system.helpers.TooltipsHelpers;

/**
 * FXML Controller class
 *
 * @author Keh Perick
 */
public class LoginController implements Initializable {

    @FXML
    private Label closeBtn;
    @FXML
    private JFXTextField userNameField;
    @FXML
    private JFXPasswordField passwordField;
    @FXML
    private JFXButton loginBtn;
    @FXML
    private Pane formContainer;
    @FXML
    private AnchorPane connectingIndicator;
    

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         closeBtn.setCursor(Cursor.HAND);
         TooltipsHelpers tooltip=new TooltipsHelpers();
         //setting tooltip to every action node
         tooltip.setToolTip(closeBtn, "Close window");
         tooltip.setToolTip(loginBtn, "login");
         tooltip.setToolTip(userNameField,"enter username here");
         tooltip.setToolTip(passwordField,"enter password");
         
         
         
    }    

    @FXML
    private void closeApp(MouseEvent event) {
        
        Platform.exit();
    }
    
    /**
     * 
     * @param event 
     */

    @FXML
    private void gotoMainPage(ActionEvent event) {
        
            JFXSnackbar errorSnackBar=new JFXSnackbar(formContainer);
            
        EventHandler handler=(EventHandler) (Event event1) -> {
            System.out.println("Try again");
            userNameField.setText("");
            userNameField.setFocusTraversable(true);
            passwordField.setText("");
            errorSnackBar.close();
        };
        if (!userNameField.getText().equals("admin") || !userNameField.getText().equals("admin")) {
           
            errorSnackBar.show("Username  or  password  is  incorrect. Please try again","Try again", 5000,handler);
            
            errorSnackBar.setEffect(new DropShadow(4, Color.rgb(0, 0, 0, .251)));
            
        }
        
        else if (userNameField.getText().equals("admin") && passwordField.getText().equals("admin")){
            Task <Boolean> task=new Task<Boolean>() {
                @Override
                protected Boolean call() throws Exception {
                try {
                    Parent mainWindow=FXMLLoader.load(getClass().getResource(Routes.MAINVIEW));
                    Scene scene=new Scene(mainWindow);
                    
                    Stage appStage=(Stage) ((Node) event.getSource()).getScene().getWindow();
                    appStage.setScene(scene);
                    
                    appStage.show();
                } catch (IOException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.WARNING, null, "and imput output exception occured line 95");
                }
                return true;
                }
            };
            
            Platform.runLater(task);
        }
    }

    
    
}
























