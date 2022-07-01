package com.adeola.customer;

public record CustomerRegistrationRequest(
    String firstName,
    String lastName,
    String email) {
}
