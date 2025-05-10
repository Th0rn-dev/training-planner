package com.training.planner.controller;

import com.training.planner.view.View;

public interface Switchable {
    default void switchTo(View view) {
        switchTo(view, null);
    }

    void switchTo(View view, Object input);
}
