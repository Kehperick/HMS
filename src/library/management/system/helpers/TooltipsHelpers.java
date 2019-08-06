/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system.helpers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;

/**
 *
 * @author Keh Perick
 */
public class TooltipsHelpers {
    
    public TooltipsHelpers(){
        
    }
    
    //method overload.
    /**
     * will be called depending on the parameters passed
     * @param label
     * @param value 
     */
    public  void setToolTip(Label label, String value) {
     Tooltip tooltip=new Tooltip(value);
          label.setTooltip(tooltip);
          tooltip.setFont(Font.font("Roboto", 14));    }
    
    /**
     * 
     * @param btn
     * @param value 
     */
      public  void setToolTip(JFXButton btn, String value) {
          
          Tooltip tooltip=new Tooltip(value);
          
          btn.setTooltip(tooltip);
          tooltip.setFont(Font.font("Roboto", 14));
    }
      
            public  void setToolTip(JFXTextField textFields, String value) {
          
          Tooltip tooltip=new Tooltip(value);
          
          textFields.setTooltip(tooltip);
          tooltip.setFont(Font.font("Roboto", 14));
    }
    
               public  void setToolTip(JFXPasswordField textFields, String value) {
          
          Tooltip tooltip=new Tooltip(value);
          
          textFields.setTooltip(tooltip);
          tooltip.setFont(Font.font("Roboto", 14));
    }
      public  void setToolTip(Button button, String value) {
          
          Tooltip tooltip=new Tooltip(value);
          
          button.setTooltip(tooltip);
          tooltip.setFont(Font.font("Roboto", 14));
    }
         public  void setToolTip(JFXComboBox combo, String value) {
          
          Tooltip tooltip=new Tooltip(value);  
          
          combo.setTooltip(tooltip);
          tooltip.setFont(Font.font("Roboto", 14));
    }
       
    
}







