package com.example.mkk;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn;

    @FXML
    private Label text;

    @FXML
    void click(ActionEvent event) {
    text.setText("Хеллоу");
    }

    @FXML
    void initialize() {
        assert btn != null : "fx:id=\"btn\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert text != null : "fx:id=\"text\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
