package com.example.chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {

    @FXML
    private TextArea massageArea;
    @FXML
    private TextField massageField;


    @FXML
    private void checkButtonClick(ActionEvent actionEvent) {
        final String usertext = massageField.getText();
        if(usertext.isEmpty()){
            return;
        }
        String.format("%s. ",usertext);
        massageArea.appendText(usertext+"\n");
        massageField.clear();
        massageField.requestFocus();
    }

}