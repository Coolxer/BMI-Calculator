package home.controller;

import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainWindowController {

    @FXML
    private JFXRadioButton femaleRadio;

    @FXML
    private JFXRadioButton maleRadio;

    @FXML
    private JFXTextField weightField;

    @FXML
    private JFXTextField heightField;

    private String gender = "";

    private double weight = 0;
    private double height = 0;

    @FXML
    void onCalculateClicked(ActionEvent event) {
       if(!weightField.getText().isEmpty())
           weight = Double.parseDouble(weightField.getText().trim());

        if(!heightField.getText().isEmpty())
            height = Double.parseDouble(heightField.getText().trim());
    }

    void

}
