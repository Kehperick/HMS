/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system.borrow;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Keh Perick
 */
public class IssueBook {
    
    private StringProperty studentName;
    private StringProperty studentFac;
    private StringProperty bookCat;
    private StringProperty borrowDate;
    private StringProperty returnDate;
    private StringProperty bookName;
    
    public IssueBook(String student, String fac, String category,String name, String bdate, String rdate){
        
        studentName=new SimpleStringProperty(this, student);
        studentFac=new SimpleStringProperty(this, fac);
        bookCat=new SimpleStringProperty(this, category);
        borrowDate=new SimpleStringProperty(this, bdate);
        returnDate=new SimpleStringProperty(this, rdate);
        bookName=new SimpleStringProperty(this, name);
    }

    public final String getStudentName() {
        return studentName.get();
    }

    public final void setStudentName(String value) {
        studentName.set(value);
    }

    public StringProperty studentNameProperty() {
        return studentName;
    }

    public final String getStudentFac() {
        return studentFac.get();
    }

    public final void setStudentFac(String value) {
        studentFac.set(value);
    }

    public StringProperty studentFacProperty() {
        return studentFac;
    }

    public final String getBookCat() {
        return bookCat.get();
    }

    public final void setBookCat(String value) {
        bookCat.set(value);
    }

    public StringProperty bookCatProperty() {
        return bookCat;
    }

    public final String getBorrowDate() {
        return borrowDate.get();
    }

    public final void setBorrowDate(String value) {
        borrowDate.set(value);
    }

    public StringProperty borrowDateProperty() {
        return borrowDate;
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

    public final String getBookName() {
        return bookName.get();
    }

    public final void setBookName(String value) {
        bookName.set(value);
    }

    public StringProperty bookNameProperty() {
        return bookName;
    }
    
    
    
}




