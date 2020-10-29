package sample.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.utils.Percent;

public class Controller {

    private Percent percent = new Percent();

    private double sum;

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
    private Label error_label;

    @FXML
    void initialize() {
        calculate_small_tip_btn.setOnAction(event -> {
            if (checkField()) {
                result_small_tip_label.setText(String.valueOf(percent.roundedTotalAmount(sum, 5)));
            }
        });

        calculate_usual_tip_btn.setOnAction(event -> {
            if (checkField()) {
                result_usual_tip_label.setText(String.valueOf(percent.roundedTotalAmount(sum, 9)));
            }
        });

        calculate_big_tip_btn.setOnAction(event -> {
            if (checkField()) {
                result_big_tip_label.setText(String.valueOf(percent.roundedTotalAmount(sum, 15)));
            }
        });
    }

    private boolean checkField() {
        try {
            if (!amount_tf.getText().equals("")) {
                sum = Double.valueOf(amount_tf.getText());
            } else {
                error_label.setText("Введите сумму");
                return false;
            }
        } catch (NumberFormatException e) {
            error_label.setText("Неверный формат ввода");
            return false;
        }

        error_label.setText("");
        return true;
    }
}
