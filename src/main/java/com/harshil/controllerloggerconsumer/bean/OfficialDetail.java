package com.harshil.controllerloggerconsumer.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

@Data
@AllArgsConstructor
public class OfficialDetail extends AddressDetail {

    @Nonnull
    private final String employeeId;

    @Nonnull
    private final String companyName;

    @Nullable
    private String companyContactEmail;
}
