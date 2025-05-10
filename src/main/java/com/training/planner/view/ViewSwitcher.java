package com.training.planner.view;


import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@RequiredArgsConstructor
public class ViewSwitcher {

    private final ViewLoader loader;
    private final ViewCacher cacher;

    private Stage stage;
    private View current;
    private View previous;

    public void initialize(Stage stage) {
        if (stage != null) {
            stage.setScene(new Scene(new Pane()));
            this.stage = stage;
            this.current = View.EMPTY;
        }
    }

    public void switchTo(View view, Object input) {
        if (current.equals(view)) {
            return;
        }

        if (view.equals(View.PREVIOUS)) {
            view = getPrevious();
        }
        CacheKey key = CacheKey.of(view, input);
        Parent root = load(key);
    }

    private Parent load(CacheKey key) {
        if (cacher.contains(key)) {
            return cacher.get(key);
        }
        return loader.load(key.getView(), key.getInput());
    }
}
