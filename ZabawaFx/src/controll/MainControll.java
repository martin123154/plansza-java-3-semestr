package controll;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainControll {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField T4;

    @FXML
    private Button button3;

    @FXML
    private Button label;

    @FXML
    private Button button;

    @FXML
    private TextField field1;

    @FXML
    private TextField field;

    @FXML
    private TextField field7;

    @FXML
    private TextField field6;

    @FXML
    private TextField field9;

    @FXML
    private TextField field8;

    @FXML
    private TextField field3;

    @FXML
    private TextField field2;

    @FXML
    private Button button1;

    @FXML
    private TextField T1;

    @FXML
    private TextField field5;

    @FXML
    private TextField T2;

    @FXML
    private TextField field4;

    @FXML
    private TextField T3;

    @FXML
    void SprawdzRzadPierwszy(ActionEvent event) {
    	String a="A";
    	if(field.getText().equals(a)==true && field1.getText().equals(a)==true){  	
    	T1.setText("Dobrze");
    		
   		}else{
   			T1.setText("Zle");
   		}
    }

    @FXML
    void SprawdzRzadDrugi(ActionEvent event) {
    	String a="A";
    	if(field2.getText().equals(a)==true && field3.getText().equals(a)==true){  	
    	T2.setText("Dobrze");
    		
   		}else{
   			T2.setText("Zle");
   		}
    }

    @FXML
    void SprawdzRzadCzwarty(ActionEvent event) {
    	String a="A";
    	if(field4.getText().equals(a)==true && field5.getText().equals(a)==true&& field6.getText().equals(a)==true){  	
    	T3.setText("Dobrze");
    		
   		}else{
   			T3.setText("Zle");
   		}
    }

    @FXML
    void SprawdzRzadTrzeci(ActionEvent event) {
    	String a="A";
    	if(field7.getText().equals(a)==true && field8.getText().equals(a)==true&& field9.getText().equals(a)==true){  	
    	T4.setText("Dobrze");
    		
   		}else{
   			T4.setText("Zle");
   		}
    }

    @FXML
    void initialize() {
        assert T4 != null : "fx:id=\"T4\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert button3 != null : "fx:id=\"button3\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert field1 != null : "fx:id=\"field1\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert field != null : "fx:id=\"field\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert field7 != null : "fx:id=\"field7\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert field6 != null : "fx:id=\"field6\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert field9 != null : "fx:id=\"field9\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert field8 != null : "fx:id=\"field8\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert field3 != null : "fx:id=\"field3\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert field2 != null : "fx:id=\"field2\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert T1 != null : "fx:id=\"T1\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert field5 != null : "fx:id=\"field5\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert T2 != null : "fx:id=\"T2\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert field4 != null : "fx:id=\"field4\" was not injected: check your FXML file 'MainPane.fxml'.";
        assert T3 != null : "fx:id=\"T3\" was not injected: check your FXML file 'MainPane.fxml'.";

    }
}
