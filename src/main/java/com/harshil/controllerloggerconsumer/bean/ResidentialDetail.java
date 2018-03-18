package com.harshil.controllerloggerconsumer.bean;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Data
@AllArgsConstructor
public class ResidentialDetail extends AddressDetail {
    @Nonnull
    private final String contact;
}
