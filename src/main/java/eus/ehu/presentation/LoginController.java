package eus.ehu.presentation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private Button myButton;

    @FXML
    private Label messageLabel;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    @FXML
    private void handleButtonClick() {
        
        if (passwordField.getText().equals("123456") && usernameField.getText().equals("admin")) {
            messageLabel.setText("Correct!");
            messageLabel.getStyleClass().setAll("text-success", "bg-success");
            messageLabel.setVisible(true);
        }
        else {
            messageLabel.setText("Try again:)");
            messageLabel.getStyleClass().setAll("text-danger", "bg-danger");
            messageLabel.setVisible(true);
        }
          
        }
       
    }
    
   













