package com.training.planner.view;


import com.training.planner.controller.Controller;
import javafx.scene.Parent;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxWeaver;
import org.springframework.stereotype.Component;

@Data
@Component
@RequiredArgsConstructor
public class ViewLoader {

    private final FxWeaver fxWeaver;

    public Parent load(View view, Object input) {
        try {
            Controller controller = (Controller) fxWeaver.getBean(view.getController());
            controller.setView(view);
            return fxWeaver.loadView(view.getController());
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Could not load view" + view.getTitle());
        }
    }
}
