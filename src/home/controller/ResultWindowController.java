package home.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ResultWindowController {

    @FXML
    private AnchorPane resultAnchorPane;

    @FXML
    private JFXTextField resultField;

    @FXML
    private JFXTextField messageField;

    private float result;
    private String message;

    @FXML
    void onBackClicked(ActionEvent event) throws IOException {
        reset();

        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/home/view/mainWindow.fxml"));
        resultAnchorPane.getChildren().setAll(anchorPane);
    }

    public void init(float result){
        this.result = result;
        resultField.setText(Double.toString(result));
        setMessage();
    }

    private void reset(){
        resultField.clear();
        messageField.clear();

        result = 0;
        message = "";


    }

    private void setMessage(){
        if(result < 16)
            message = "wyglodzenie";
        else if(result >= 16 && result <= 16.99)
            message = "wychudzenie";
        else if(result >= 17 && result <= 18.49)
            message = "niedowaga";
        else if(result >= 18.5 && result <= 24.99)
            message = "waga prawidłowa";
        else if(result >= 25 && result <= 29.99)
            message = "nadwaga";
        else if(result >= 30 && result <= 34.99)
            message = "I stopień otyłości";
        else if(result >= 35 && result <= 39.99)
            message = "II stopień otyłości";
        else
            message = "otylosc skrajna";

        messageField.setText(message);
    }

}