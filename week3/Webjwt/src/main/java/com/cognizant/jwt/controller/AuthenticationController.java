package com.cognizant.jwt.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.jwt.model.AuthenticationResponse;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authHeader) {

        LOGGER.info("Start");

        System.out.println("Authorization Header : " + authHeader);

        String encodedCredentials = authHeader.substring(6);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);

        String decodedCredentials =
                new String(decodedBytes, StandardCharsets.UTF_8);

        System.out.println("Decoded : " + decodedCredentials);

        String[] values = decodedCredentials.split(":");

        String username = values[0];
        String password = values[1];

        System.out.println("Username : " + username);
        System.out.println("Password : " + password);

        LOGGER.info("End");

        return new AuthenticationResponse("dummy-token");
    }
}