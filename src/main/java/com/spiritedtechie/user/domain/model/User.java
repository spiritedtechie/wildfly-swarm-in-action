package com.spiritedtechie.user.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class User implements Serializable {

    private Long id;

    private String firstName;

    private String lastName;

    private String emailAddress;

}
