package com.training.planner.view;


import com.training.planner.controller.impl.HomeController;
import lombok.Getter;

@Getter
public enum View {
    HOME(HomeController.class, "Home", true, true),
    DISCOVER(null, "Discover", true, false),

    PREVIOUS(null, null, false, false),
    EMPTY(null, null, false, false);

    private final Class<?> controller;
    private final String title;
    private final Boolean hasSidebar;
    private final Boolean hasHeader;

    View(Class<?> controller, String title, boolean hasSidebar, boolean hasHeader) {
        this.controller = controller;
        this.title = title;
        this.hasSidebar = hasSidebar;
        this.hasHeader = hasHeader;
    }

    public static View getDefault() {
        return View.EMPTY;
    }

    public static View getEmpty() {
        return View.EMPTY;
    }

    public static String getTitle(View view) {
        return view.getTitle().toLowerCase();
    }

    public boolean getHasSidebar() {
        return hasSidebar;
    }

    public boolean getHasHeader() {
        return hasHeader;
    }
}
