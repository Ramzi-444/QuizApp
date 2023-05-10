package com.example.quiz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.Scene;



import java.io.IOException;

public class AfterLogin {

    @FXML
    private Button logout;
    @FXML
    private Button enter;


    public void userLogOut(ActionEvent event) throws IOException {
        Main m = new Main();
        m.changeScene("hello-view.fxml");

    }


    @FXML
    void enterQuiz(ActionEvent event) throws IOException {

        Main m = new Main();
        m.changeScene("home.fxml");

    }
}
