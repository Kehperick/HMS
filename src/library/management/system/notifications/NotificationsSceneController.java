/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system.notifications;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Keh Perick
 */
public class NotificationsSceneController implements Initializable {
private static NotificationsSceneController instance;
    @FXML
    private AnchorPane mainAnchorPane;
   
    public NotificationsSceneController(){
        instance=this;
    }
    
    public static NotificationsSceneController getInstance(){
        return instance;
    }
    
    public AnchorPane getMainAnchorPane(){
        return mainAnchorPane;
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}



