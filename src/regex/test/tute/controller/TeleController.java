package regex.test.tute.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

public class TeleController {
    @FXML
    private TextField txtTele;

    @FXML
    private void clickSubmit(ActionEvent actionEvent) {
        if(isValidTele(txtTele.getText())) {
            new Alert(Alert.AlertType.CONFIRMATION,"Valid Telephone No", ButtonType.OK).showAndWait();
            txtTele.clear();
            txtTele.requestFocus();
        } else {
            new Alert(Alert.AlertType.ERROR,"Invalid Telephone No",ButtonType.OK).showAndWait();
            txtTele.requestFocus();
        }
    }

    private boolean isValidTele(String input) {
        return input.matches("\\d{3}[-]\\d{7}");
    }
}
