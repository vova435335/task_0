package sample.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField amount_tf;

    @FXML
    private Button calculate_small_tip_btn;

    @FXML
    private Label result_small_tip_label;

    @FXML
    private Button calculate_usual_tip_btn;

    @FXML
    private Label result_usual_tip_label;

    @FXML
    private Button calculate_big_tip_btn;

    @FXML
    private Label result_big_tip_label;

    @FXML
    void initialize() {
        assert amount_tf != null : "fx:id=\"amount_tf\" was not injected: check your FXML file 'sample.fxml'.";
        assert calculate_small_tip_btn != null : "fx:id=\"calculate_small_tip_btn\" was not injected: check your FXML file 'sample.fxml'.";
        assert result_small_tip_label != null : "fx:id=\"result_small_tip_label\" was not injected: check your FXML file 'sample.fxml'.";
        assert calculate_usual_tip_btn != null : "fx:id=\"calculate_usual_tip_btn\" was not injected: check your FXML file 'sample.fxml'.";
        assert result_usual_tip_label != null : "fx:id=\"result_usual_tip_label\" was not injected: check your FXML file 'sample.fxml'.";
        assert calculate_big_tip_btn != null : "fx:id=\"calculate_big_tip_btn\" was not injected: check your FXML file 'sample.fxml'.";
        assert result_big_tip_label != null : "fx:id=\"result_big_tip_label\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
