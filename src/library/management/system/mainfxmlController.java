/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXPopup;
import com.jfoenix.controls.JFXRippler;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import library.management.system.about.dialogBase;
import library.management.system.borrow.BorrowController;
import library.management.system.borrowedBooks.BorrowedSceneController;
import library.management.system.help.Help;
import library.management.system.helpers.Routes;
import library.management.system.helpers.TooltipsHelpers;
import library.management.system.notifications.NotificationsSceneController;

/**
 *
 * @author Keh Perick
 */
public class mainfxmlController implements Initializable {
    
    private Label label;
    @FXML
    private Pane rightBaseContainer;
    @FXML
    private Button homeBtn;
    @FXML
    private Button borrowedBtn;
    @FXML
    private Button aboutUsBtn;
    @FXML
    private Button helpBtn;
    @FXML
    private Button exitBtn;
    @FXML
    private StackPane stackPane;
    @FXML
    private AnchorPane scrollpane;
    @FXML
    private Label labelHeader;
    @FXML
    private ImageView menuImg;
    @FXML
    private JFXButton notificationBtn;
    private ImageView moreBtn;
    @FXML
    private Pane headerToolbar;
    @FXML
    private Pane moreBtnPane;
    
//    instantiating the tooltip helper class
    TooltipsHelpers tooltip=new TooltipsHelpers();
    
  private static mainfxmlController instance;
   
    public mainfxmlController(){
        instance=this;
    }
    
    public static mainfxmlController getInstance(){
        return instance;
    } 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            AnchorPane anchor=FXMLLoader.load(getClass().getResource(Routes.NOTIFICATIONVIEW));
            scrollpane.getChildren().add(anchor);
            
             AnchorPane borrwAnchor=FXMLLoader.load(getClass().getResource(Routes.BORROWEDVIEW));
            scrollpane.getChildren().add(borrwAnchor);
            
            BorderPane pane=FXMLLoader.load(getClass().getResource(Routes.BORROWVIEW));
            scrollpane.getChildren().add(pane);
            // TODO
        } catch (IOException ex) {
            Logger.getLogger(mainfxmlController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        List<Button> list=new ArrayList<>(Arrays.asList(homeBtn,borrowedBtn,aboutUsBtn,notificationBtn,helpBtn,exitBtn));
        
        list.forEach((t) -> {
       t.setCursor(Cursor.HAND);
        });
        
        tooltip.setToolTip(homeBtn, "Home");
        tooltip.setToolTip(notificationBtn, "notifications");
        tooltip.setToolTip(exitBtn, "exit application");
        tooltip.setToolTip(borrowedBtn, "Borrowed Books");
        tooltip.setToolTip(aboutUsBtn, "About us");
        tooltip.setToolTip(helpBtn, "help");
        
       
    }    
    private void exitWindow(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void openAboutUsDialog(ActionEvent event) {
      Platform.runLater(() -> {
        JFXDialog dialog=new JFXDialog(stackPane, new dialogBase(),JFXDialog.DialogTransition.TOP);
        dialog.show();
      });
    }

   

    @FXML
    private void openHelpDialog(ActionEvent event) {
        Platform.runLater(() -> {
        JFXDialog dialog=new JFXDialog(stackPane, new Help(), JFXDialog.DialogTransition.CENTER);
        dialog.show();
        });
    }

    @FXML
    private void closeWindow(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    private void openBorrowScene(ActionEvent event) {
        
        Task<Boolean> task=new Task<Boolean>() {
            @Override
            protected Boolean call() throws Exception {
                 labelHeader.setText("Issue Book");
          try {
            BorderPane pane=FXMLLoader.load(getClass().getResource(Routes.BORROWVIEW));
            scrollpane.getChildren().add(pane);
            // TODO
        } catch (IOException ex) {
            Logger.getLogger(mainfxmlController.class.getName()).log(Level.SEVERE, null, ex);
        }
          return true;
            }
//
//            @Override
//            protected void running() {
//                super.running();
//                try {
//                    AnchorPane loadingPane=FXMLLoader.load(getClass().getResource(Routes.LOADINGVIEW));
//                    scrollpane.getChildren().add(loadingPane);
//                    
//                } catch (IOException ex) {
//                    Logger.getLogger(mainfxmlController.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            
//            }

           
        };
        Platform.runLater(task);
    }

    @FXML
    private void openBorrowedScene(ActionEvent event) {
        labelHeader.setText("Borrowed List");
          try {
            AnchorPane pane=FXMLLoader.load(getClass().getResource(Routes.BORROWEDVIEW));
            scrollpane.getChildren().add(pane);
            // TODO
        } catch (IOException ex) {
            Logger.getLogger(mainfxmlController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void openNotificationScene(ActionEvent event) {
        
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                
           
          labelHeader.setText("Notifications");
          try {
            AnchorPane pane=FXMLLoader.load(getClass().getResource(Routes.NOTIFICATIONVIEW));
            scrollpane.getChildren().add(pane);
            // TODO
        } catch (IOException ex) {
            Logger.getLogger(mainfxmlController.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          
            }
           
        });
    }

    @FXML
    private void openMoreActionPopup(MouseEvent event) {
          JFXRippler rippler = new JFXRippler(moreBtnPane, JFXRippler.RipplerMask.CIRCLE, JFXRippler.RipplerPos.BACK);
        headerToolbar.getChildren().add(moreBtnPane);
        
        String style= ""
               + "-fx-text-fill:black;"
                + "-fx-font-size:15px;"
                + "-fx-font-family:'Roboto',sans-serif";

        JFXListView<Label> list = new JFXListView<>();
       Label notification=new Label("Updates and more");
       Label darkMode=new Label("Dark Mode ");
       Label settings=new Label("Settings");
       Label lightMode=new Label("Light Mode ");

       notification.setStyle(style);
       darkMode.setStyle(style);
       lightMode.setStyle(style);
       settings.setStyle(style);
       
       
       //dark style sheet to be loaded
        String stylesheet=library.management.system.LibraryManagementSystem.class.getResource("darkmode.css").toExternalForm();
       
       darkMode.setOnMouseClicked((e) -> {
           //           logging updatate message when the appearance change
           Logger.getLogger(mainfxmlController.class.getSimpleName()).log(Level.INFO, "changin appearance to dark mode");

          String darkModeStyle="-fx-background-color:#2d2d2d;";
          
          //styling 
           labelHeader.setStyle(darkModeStyle);
           headerToolbar.setStyle(darkModeStyle);
           rightBaseContainer.setStyle(darkModeStyle);
           
           BorrowController.getInstance().getBackPane().getStylesheets().add(stylesheet);
            BorrowedSceneController.getInstance().getMainPane().getStylesheets().add(stylesheet);
            NotificationsSceneController.getInstance().getMainAnchorPane().getStylesheets().add(stylesheet);
       });
       
       lightMode.setOnMouseClicked((ev) -> {
           String lightModeStyle=library.management.system.LibraryManagementSystem.class.getResource("main.css").toExternalForm();
           BorrowController.getInstance().getBackPane().getStylesheets().add(lightModeStyle);
           BorrowedSceneController.getInstance().getMainPane().getStylesheets().add(lightModeStyle);
           NotificationsSceneController.getInstance().getMainAnchorPane().getStylesheets().add(lightModeStyle);
       });
       
     
       
       //adding items to list
      
       list.getItems().addAll(darkMode,lightMode,notification,settings);
             
         JFXPopup popup = new JFXPopup(list);
         popup.show(moreBtnPane, JFXPopup.PopupVPosition.TOP, JFXPopup.PopupHPosition.RIGHT);
    }
    
    
}

























