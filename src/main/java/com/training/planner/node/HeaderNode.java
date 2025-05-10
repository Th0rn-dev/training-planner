package com.training.planner.node;

import com.training.planner.controller.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HeaderNode extends HBox implements Loadable {

    private final Controller controller;

    @FXML
    private TextField searchField;

    public HeaderNode(Controller controller) {
        this.controller = controller;

        load(this);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @Override
    public String getPath() {
        return "/resouces/nodes/header-node.fxml";
    }

    @FXML
    private void onSearch(ActionEvent event) {
        String text = searchField.getText();
    }
}
