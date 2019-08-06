/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system.borrowedBooks;

import com.jfoenix.controls.JFXPopup;
import com.jfoenix.controls.JFXTreeTableColumn;
import com.jfoenix.controls.JFXTreeTableView;
import com.jfoenix.controls.RecursiveTreeItem;
import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.beans.property.IntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Keh Perick
 */
public class BorrowedSceneController implements Initializable {
    
    
    private static BorrowedSceneController instance;
   
    public BorrowedSceneController(){
        instance=this;
    }
    
    public static BorrowedSceneController getInstance(){
        return instance;
    }
    
    public AnchorPane getMainPane(){
        return mainContainer;
    }

    /**
     * Initializes the controller class.
     */
      @FXML
    private AnchorPane mainContainer;

    @FXML
    private JFXTreeTableView<BorrowedDetail> borrowTable;
    @FXML
    private TextField searchBar;
    @FXML
    private Label countLabel;
    private JFXPopup popup;
    
    Task< Boolean> task=null;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        JFXTreeTableColumn<BorrowedDetail, String> username=new JFXTreeTableColumn<>("Student Name");
        username.setPrefWidth(230);
        username.setCellValueFactory((TreeTableColumn.CellDataFeatures<BorrowedDetail, String> param) -> param.getValue().getValue().username);
        
           JFXTreeTableColumn<BorrowedDetail, String> matNum=new JFXTreeTableColumn<>("Mat Number");
        matNum.setPrefWidth(210);
        matNum.setCellValueFactory((TreeTableColumn.CellDataFeatures<BorrowedDetail, String> param) -> param.getValue().getValue().matNo);
        // TODO
        
           JFXTreeTableColumn<BorrowedDetail, String> bookName=new JFXTreeTableColumn<>("Book Name");
        bookName.setPrefWidth(290);
        bookName.setCellValueFactory((TreeTableColumn.CellDataFeatures<BorrowedDetail, String> param) -> param.getValue().getValue().bookName);
       
        
           JFXTreeTableColumn<BorrowedDetail, String> returnDate=new JFXTreeTableColumn<>("Return Date");
        returnDate.setPrefWidth(210);
        returnDate.setCellValueFactory((TreeTableColumn.CellDataFeatures<BorrowedDetail, String> param) -> param.getValue().getValue().returnDate);
        
        
            ObservableList<BorrowedDetail> borrowedDetails=FXCollections.observableArrayList();
          
            borrowedDetails.add(new BorrowedDetail("Paul", "SE32A93", "Introduction to computing", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Samson", "GEH2A93", "Introduction to computing", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Lemuel", "DANOAW20", "GeoLocation edition pre", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Edison", "SE32A93", "Introduction to computing", "01/05/1999"));
             borrowedDetails.add(new BorrowedDetail("Paul", "SE32A93", "Introduction to computing", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Samson", "GEH2A93", "Introduction to computing", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Lemuel", "DANOAW20", "GeoLocation edition pre", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Edison", "SE32A93", "Introduction to computing", "01/05/1999"));
             borrowedDetails.add(new BorrowedDetail("Paul", "SE32A93", "Introduction to computing", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Samson", "GEH2A93", "Introduction to computing", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Lemuel", "DANOAW20", "GeoLocation edition pre", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Edison", "SE32A93", "Introduction to computing", "01/05/1999"));
             borrowedDetails.add(new BorrowedDetail("Paul", "SE32A93", "Introduction to computing", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Samson", "GEH2A93", "Introduction to computing", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Lemuel", "DANOAW20", "GeoLocation edition pre", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Edison", "SE32A93", "Introduction to computing", "01/05/1999"));
             borrowedDetails.add(new BorrowedDetail("Paul", "SE32A93", "Introduction to computing", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Samson", "GEH2A93", "Introduction to computing", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Lemuel", "DANOAW20", "GeoLocation edition pre", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Edison", "SE32A93", "Introduction to computing", "01/05/1999"));
             borrowedDetails.add(new BorrowedDetail("Paul", "SE32A93", "Introduction to computing", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Samson", "GEH2A93", "Introduction to computing", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Lemuel", "DANOAW20", "GeoLocation edition pre", "01/05/1999"));
            borrowedDetails.add(new BorrowedDetail("Edison", "SE32A93", "Introduction to computing", "01/05/1999"));
            
          
            
            task=new Task<Boolean>() {
            @Override
            protected Boolean call() throws Exception {
                for (int i = 0; i < 100; i++) {
                    
            borrowTable.getColumns().setAll(matNum,username,bookName,returnDate);
            final TreeItem<BorrowedDetail> root=new RecursiveTreeItem<>(borrowedDetails, RecursiveTreeObject::getChildren);
            borrowTable.setRoot(root);
            borrowTable.setShowRoot(false);
                    System.out.println(""+i);
                updateMessage(Integer.toString(i));
                
                }
            return true;
            }

            @Override
            protected void succeeded() {
                super.succeeded(); 
                System.out.println("Done loading data to table");
            }
            
        };
            
            Platform.runLater(task);
            //setting the root fo the tableview
            IntegerProperty itemCount=borrowTable.currentItemsCountProperty();
            
            //get the total number of items in table
            countLabel.setText(itemCount.getValue().toString());
            //search function 
            searchBar.textProperty().addListener((observable, oldValue, newValue) -> {
                borrowTable.setPredicate((TreeItem<BorrowedDetail> borrowedDet) -> {
                    Boolean flag=borrowedDet.getValue().username.getValue().contains(newValue)||
                            borrowedDet.getValue().matNo.getValue().contains(newValue)||
                            borrowedDet.getValue().bookName.getValue().contains(newValue) ||
                            borrowedDet.getValue().returnDate.getValue().contains(newValue);
                    return flag;
                });
            });
            
         
            
          
    }    

    
}













































