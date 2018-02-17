package com.harshil.controllerloggerconsumer.controller;

import io.github.logger.controller.annotation.Logging;
import io.github.logger.controller.annotation.NoLogging;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Logging
public class FooBarController {

    @RequestMapping(value = "/foo", method = RequestMethod.GET)
    @ResponseBody
    public String foo(
            @RequestParam String accessToken,
            @RequestParam String username,
            @RequestParam String accountNumber,
            @RequestParam String accountBalance,
            @RequestParam String securityProtocol) {
        // accessToken won't be logged being in default list of blacklisted params
        // username will be logged
        // accountNumber and accountBalance won't be logged being blacklisted by custom regex
        // securityProtocol won't be logged being in custom list of blacklisted params
        return "This API will be logged.";
    }

    @RequestMapping(value = "/bar", method = RequestMethod.GET)
    @ResponseBody
    @NoLogging
    public String bar() {
        return "This API will NOT be logged.";
    }
}
