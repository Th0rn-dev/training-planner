package com.training.planner;

import com.github.spring.boot.javafx.SpringJavaFXApplication;
import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlannerApplication extends SpringJavaFXApplication {
    private static String[] args;

    public static void main(String[] args) {
//        PlannerApplication.args = args;
//        PlannerApplication.launch(args);
        launch(PlannerApplication.class, args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//        SpringApplication.run(PlannerApplication.class, args);
        super.start(primaryStage);
    }
}
