package com.training.planner.core;

import javafx.stage.Stage;
import org.springframework.context.ApplicationEvent;
import org.w3c.dom.events.Event;

public class StageReadyEvent extends ApplicationEvent {
    public StageReadyEvent(Object source) {
        super(source);
    }

    public Stage getStage() {
        return ((Stage) getSource());
    }

    public Stage getDefault(StageReadyEvent event) {
        Stage stage = event.getStage();
        stage.centerOnScreen();
        stage.setResizable(false);
        return stage;
    }
}

