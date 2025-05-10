package com.training.planner.view;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class CacheKey {
    private View view;
    private Object input;

    public static CacheKey of(View view, Object input) {
        return new CacheKey(view, input);
    }
}
