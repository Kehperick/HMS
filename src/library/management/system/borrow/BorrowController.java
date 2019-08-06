/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system.borrow;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Keh Perick
 */
public class BorrowController implements Initializable {

    @FXML
    private JFXTextField nameField;
    @FXML
    private JFXComboBox<String> schoolCombo;
    @FXML
    private JFXComboBox<String> bookCombo;
    @FXML
    private JFXDatePicker issueDatePicker;
    @FXML
    private JFXButton issueBtn;
    @FXML
    private JFXDatePicker returnDatePicker;
    @FXML
    private JFXTextField bookNameField;
    @FXML
    private BorderPane backPane;
    @FXML
    private Pane topPane;
    @FXML
    private Pane bottomPane;
    
      private static BorrowController instance;
   
    public BorrowController(){
        instance=this;
    }
    
    public static BorrowController getInstance(){
        return instance;
    }
    
    // getting all the above private fiels to change color during dark mode
    public Pane getTopPane(){
        return topPane;
    }
    public Pane getBottomPane(){
        return bottomPane;
        
    }
    public BorderPane getBackPane(){
        return backPane;
    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] listItems={"Faculty Of Engineering and Technology"
                ,"Faculty of Agriculture"
                ,"College Of Technology"
                ,"Faculty Of Health Science"};
        List<String> item=Arrays.asList(listItems);
        
      
        ObservableList<String> items=FXCollections.observableArrayList(item);
        // TODO
        schoolCombo.getItems().addAll(items);
        
        //adding content to the subject category
        String[] bookListItems={
            "Mathematics",
            "Chemistry",
            "Physics",
            "Biology",
            "Computer Science"
        };
        
        //adding thea above array to list
        List<String> bookItem=Arrays.asList(bookListItems);
        ObservableList<String> bookItems=FXCollections.observableArrayList(bookItem);
        bookCombo.getItems().addAll(bookItems);
    }    

    @FXML
    private void issueBook(ActionEvent event) {
    }
    
}













