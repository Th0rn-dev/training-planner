package com.training.planner.node;

import com.training.planner.controller.Controller;
import com.training.planner.view.View;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class SidebarNode extends StackPane implements Loadable {

    private final Controller controller;
    @FXML
    private Button homeButton;

    public SidebarNode(Controller controller) {
        this.controller = controller;
        load(this);
    }

    @Override
    public String getPath() {
        return "/resources/nodes/sidebar-node.fxml";
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String id = "%s-button-clicked";
        String title = View.getTitle(controller.getView());
        switch (title.concat("Button")) {
            case "homeButton" -> System.out.println("Home Button");
            case "anotherButton" -> System.out.println("Another Button");
        }

    }

    @FXML
    private void onHome(ActionEvent event) {
        controller.switchTo(View.HOME);
    }
}
