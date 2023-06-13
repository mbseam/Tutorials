package com.mb.notation;

import java.lang.annotation.*;

@Repeatable(Multiple.class) // Dikkat
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Single {
    String value();
}