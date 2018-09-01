package home.controller;

import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainWindowController {

    @FXML
    private AnchorPane mainAnchorPane;

    @FXML
    private JFXRadioButton femaleRadio;

    @FXML
    private JFXRadioButton maleRadio;

    @FXML
    private JFXTextField weightField;

    @FXML
    private JFXTextField heightField;

    private String gender = "";

    private float weight = 0;
    private float height = 0;

    private float result = 0;

    @FXML
    void onCalculateClicked(ActionEvent event) throws IOException {
        checkValues();
        calculateBMI();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/home/view/resultWindow.fxml"));

        AnchorPane anchorPane = loader.load();

        ResultWindowController resultWindowController = loader.getController();
        resultWindowController.init(result);

        mainAnchorPane.getChildren().setAll(anchorPane);
    }

    private void readWeight(){
        if(!weightField.getText().isEmpty())
            weight = Float.parseFloat(weightField.getText().trim());
    }

    private void readHeight(){
        if(!heightField.getText().isEmpty())
            height = Float.parseFloat(heightField.getText().trim());
    }

    private void checkValues(){
        readWeight();
        readHeight();

        //...
    }

    private void calculateBMI(){
        height /= 100;

        result = weight / (height * height);
    }

}
