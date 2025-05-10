package com.training.planner.view;

import javafx.scene.Parent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Component
@RequiredArgsConstructor
public class ViewCacher {
    private static final Map<CacheKey, Parent> cache = new HashMap<>();

    public void cache(CacheKey key, Parent root) {
        if (!contains(key)) {
            cache.put(key, root);
        }
    }

    public boolean contains(CacheKey key) {
        return cache.containsKey(key);
    }

    public Parent get(CacheKey key) {
        return cache.get(key);
    }
}

