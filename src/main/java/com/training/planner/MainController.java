package com.training.planner;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Getter
@Component
@RequiredArgsConstructor
public class MainController extends FxController implements CommandLineRunner {
    private final String source = "fxml/main.fxml";

//    @FXML
//    private Button button;


    @Override
    public void init() {
//        button.setOnMouseClicked(mouseEvent -> messageController.getStage().show());
//        messageController.getStage().initOwner(getStage());
//        messageController.getStage().initModality(Modality.APPLICATION_MODAL);
    }

    @Override
    public void run(String... args) {
        getStage().show();
    }
}