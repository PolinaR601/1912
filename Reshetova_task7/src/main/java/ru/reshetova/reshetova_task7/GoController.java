package ru.reshetova.reshetova_task7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private TextField chTextField;

    @FXML
    private Button go;

    @FXML
    private Label result;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        int num = Integer.parseInt(chTextField.getText().toString());
        String description;
        int digitCount = String.valueOf(num).length();
        if (digitCount == 1) {
            description = "однозначное";
        }else if (digitCount == 2) {
                description = "двузначное";
        }else if (digitCount == 3) {
                description = "трехзначное";
        }else {
            description = "Ошибка: число должно быть от 1 до 999";
        }
        if (num % 2 == 0) {
                description += " четное число ";
        }else {
                description += " нечетное число ";
        }
        result.setText(description);
    }
}
