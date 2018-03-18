package com.harshil.controllerloggerconsumer.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;


@Data
@AllArgsConstructor
public class User {
    @Nullable
    private final Integer id;

    @Nonnull
    private final String email;

    @Nonnull
    private final String password;

    @Nonnull
    private final UserDetail userDetails;

    @Nullable
    private final ResidentialDetail residentialDetail;

    @Nullable
    private final OfficialDetail officialDetail;
}
