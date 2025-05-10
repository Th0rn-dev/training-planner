package com.training.planner.node;

import com.training.planner.controller.Controller;
import com.training.planner.view.View;
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
        load(thid);
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
            case "homeButton" -> homeButton.setid(String.format(id, title));
        }

    }
}
