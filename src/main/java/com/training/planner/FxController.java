package com.training.planner;

import jakarta.annotation.PostConstruct;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.Getter;

import java.io.IOException;
import java.io.InputStream;


@Getter
abstract public class FxController {
    private final Stage stage = new Stage();
    private Scene scene;

    protected abstract String getSource();


    {
        FXMLLoader fxmlLoader = new FXMLLoader();
        try (InputStream inputStream = fxmlLoader.getClass().getClassLoader().getResourceAsStream(getSource())) {
            fxmlLoader.setControllerFactory(param -> this);
            Parent root = fxmlLoader.load(inputStream);
            scene = new Scene(root);
            scene.getStylesheets().add("@../style.css");
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
            Platform.exit();
        }
    }

    public void initialize() {
    }

    @PostConstruct
    public void init() {
    }

}
