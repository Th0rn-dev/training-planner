package com.training.planner.controller;


import com.training.planner.node.HeaderNode;
import com.training.planner.node.SidebarNode;
import com.training.planner.view.View;
import com.training.planner.view.ViewSwitcher;
import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@RequiredArgsConstructor
public class Controller implements Switchable{

    private final ViewSwitcher viewSwitcher;
    private View view;
    private Object input;

    @FXML
    private StackPane root;
    @FXML
    private BorderPane layout;
    @FXML
    private Pane content;

    protected void initialize() {
        if (view.getHasSidebar()) {
            layout.setLeft(new SidebarNode(this));
        }
        if (view.getHasHeader()) {
            content.getChildren().add(0, new HeaderNode(this));
        }
        configure();
    }

    protected void configure() {}

    @Override
    public void switchTo(View view, Object input) {
        viewSwitcher.switchTo(view, input);
    }
}
