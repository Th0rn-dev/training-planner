package com.training.planner.controller.impl;


import com.training.planner.controller.Controller;
import com.training.planner.view.ViewSwitcher;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import lombok.Setter;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;

@Setter
@Component
@FxmlView("/resources/views/home-view.fxml")
public class HomeController extends Controller {

    @FXML
    private VBox sectionPane;

    public HomeController(ViewSwitcher viewSwitcher) {
        super(viewSwitcher);
    }
}
