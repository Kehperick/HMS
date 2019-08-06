/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system.connectionManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import library.management.system.borrowedBooks.BorrowedDetail;

/**
 *
 * @author Keh Perick
 */
public class ConnectionManager {
    
    Connection connection=null;
    Statement statement=null;
    private String USER="root";
    private String PASSWORD="admin";
    ResultSet resultSet=null;
    private String DB_URL="jdbc:mysql://localhost/LMS";
    private boolean driverLoaded=false;
    private boolean isConnected=false;
    
    
    public ConnectionManager(String userName, String password, Label label){
        
        try {
            //registering driver
            Class.forName("com.mysql.jdbc.driver");
            driverLoaded=true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.INFO, "Unable to laod driver");
            System.out.println("unable to load driver class.");
            label.setText("Unable to Load driver class");
        }
    }
    
    //connect to the database
    public void connectToDB(){
        if (driverLoaded) {
             Properties info = new Properties();
        info.put("user", USER);
        info.put("password", PASSWORD);
        
        try {
            connection=DriverManager.getConnection(DB_URL, info);
            isConnected=true;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.INFO, null, "Unable to connect to db");
        }
        }
       
    }
    
    
    //donwload the borrowed information
    /**
     * get all fields within the issuetable of the LMS database
     * @return 
     */
   public ObservableList<BorrowedDetail> getBorrowedContent(){
       
       
     ObservableList list=FXCollections.observableArrayList();
     StringProperty studentName = new SimpleStringProperty();
     StringProperty bookName=new SimpleStringProperty();
     StringProperty returnDate=new SimpleStringProperty();
     StringProperty matNo=new SimpleStringProperty();
       IntegerProperty id=new SimpleIntegerProperty();
     String sql="SELECT * FROM issuetable ";
     String sql2="SELECT ";
       if (isConnected) {
           try {
               statement=connection.createStatement();
               resultSet=statement.executeQuery(sql);
               while (resultSet.next()) {
                   id.set(resultSet.getInt("id"));
                   studentName.set(resultSet.getString("user_name"));
                   bookName.set(resultSet.getString("book_name"));
                   returnDate.setValue(resultSet.getString("return_date"));
                   matNo.setValue(resultSet.getString("matricule_no"));
                   
       list.add(new BorrowedDetail(matNo.get(), studentName.get(),bookName.get(), returnDate.get()));
               }
           } catch (SQLException ex) {
               Logger.getLogger(ConnectionManager.class.getName()).log(Level.WARNING, null, "unable to run the sql statement :"+sql);
           }
           
         
        }
       return list;
   }
   
   public void insertToTable(String mat, String college, String bookName, String returnDate){
       String student_name="SELECT student_name,student_faculty FROM student WHERE matricule_no='"+mat+"'";
       String sql= "INSERT INTO issuetable(id,user_name,return_date,book_name,matricule_no) "
               + "VALUES(null,'"+mat+"','"+returnDate+"','"+mat+"' )";
      
   }
   
   
   /**
    * close connection to database
    * @throws SQLException 
    */
   public void closeConnection() throws SQLException{
       if (isConnected) {
           resultSet.close();
           statement.closeOnCompletion();
           connection.close();
           
           
       }
   }
}



















