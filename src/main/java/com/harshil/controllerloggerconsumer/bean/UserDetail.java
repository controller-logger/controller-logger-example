package com.harshil.controllerloggerconsumer.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Data
@AllArgsConstructor
public class UserDetail {
    @Nullable
    private final Integer id;

    @Nullable
    private final Integer userId;

    @Nonnull
    private final String firstName;

    @Nonnull
    private final String lastName;

    @Nonnull
    private final Gender gender;
}
