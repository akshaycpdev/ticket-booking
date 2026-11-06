package com.ticketease.auth.dto;

import lombok.Data;

@Data
public class RegisterRequest {
    private String mobileNumber;
    private String password;
    private String fullName;
}
