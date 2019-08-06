/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system.borrowedBooks;

import com.jfoenix.controls.datamodels.treetable.RecursiveTreeObject;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Keh Perick
 */
public class BorrowedDetail extends RecursiveTreeObject<BorrowedDetail>{
    
   StringProperty username;
   StringProperty bookName;
   StringProperty returnDate;
   StringProperty matNo;
    
    public BorrowedDetail (String username, String matNo, String bookName, String returnDate){
        this.username=new SimpleStringProperty(username);
        this.bookName=new SimpleStringProperty(bookName);
        this.matNo=new SimpleStringProperty(matNo);
        this.returnDate=new SimpleStringProperty(returnDate);
    }

    public final String getUsername() {
        return username.get();
    }

    public final void setUsername(String value) {
        username.set(value);
    }

    public StringProperty usernameProperty() {
        return username;
    }

    public final String getBookName() {
        return bookName.get();
    }

    public final void setBookName(String value) {
        bookName.set(value);
    }

    public StringProperty bookNameProperty() {
        return bookName;
    }

    public final String getReturnDate() {
        return returnDate.get();
    }

    public final void setReturnDate(String value) {
        returnDate.set(value);
    }

    public StringProperty returnDateProperty() {
        return returnDate;
    }

    public final String getMatNo() {
        return matNo.get();
    }

    public final void setMatNo(String value) {
        matNo.set(value);
    }

    public StringProperty matNoProperty() {
        return matNo;
    }
    
}






