package it.polito.tdp.lab0.es1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
 import java.util.regex.* ;

public class FXMLController {

    @FXML
    private TextField idNome;

    @FXML
    private TextField idPassword;

    @FXML
    private Label txtLabel;

    @FXML
    void metodoAccedi(ActionEvent event) {
    	// bottoneClear.setDisable(true);
    	String nome= idNome.getText();
    	String password= idPassword.getText();
    	String Regex="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!?@#"
    	
    	
    	if(idNome.getText().compareTo("")==0 || idPassword.getText().compareTo("")==0)     {
	        txtLabel.setTextFill(Color.RED);
    		txtLabel.setText("Nome utente e/o password inseriti");
    		return;
    		
    		
    		
    
    	}
    	if(idPassword.getText().matches("[a-zA-Z0-9!?@#]*"));
    	{
    	
    	    txtLabel.setText("Accesso consentito");
    	    txtLabel.setTextFill(Color.RED);
    	   
    	    {
    	/*if(!idPassword.getText().matches("[0-9!?@#]*"));
    	    txtLabel.setText("Accesso non consentito");
    	    txtLabel.setTextFill(Color.RED);
    	if(!idPassword.getText().matches("[a-zA-Z!?@#]*"));
    	   txtLabel.setText("Accesso non consentito");
    	   txtLabel.setTextFill(Color.RED);
    	if(!idPassword.getText().matches("\"[a-zA-Z0-9]*"));
    	   txtLabel.setText("Accesso non consentito");
    	   txtLabel.setTextFill(Color.RED);
    	
    		  
    		  
    		  */
    		  }
    		
    }
}
}



