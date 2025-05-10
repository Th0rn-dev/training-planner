package com.training.planner.core;

import com.training.planner.PlannerApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

public class ApplicationInitializer extends Application {

    private ConfigurableApplicationContext context;

    @Override
    public void start(Stage stage) throws Exception {
        context.publishEvent(new StageReadyEvent(stage));
    }

    @Override
    public void init() {
        context = new SpringApplicationBuilder(PlannerApplication.class).run();
    }

    @Override
    public void stop() {
        context.close();
        Platform.exit();
    }

    @Component
    @RequiredArgsConstructor
    public static class PrimaryStageInitializer implements ApplicationListener<StageReadyEvent> {

        @Override
        public void onApplicationEvent(StageReadyEvent event) {
            Stage stage = event.getDefault(event);


        }
    }
}
