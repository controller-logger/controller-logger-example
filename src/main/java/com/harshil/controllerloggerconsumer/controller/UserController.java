package com.harshil.controllerloggerconsumer.controller;

import com.harshil.controllerloggerconsumer.bean.User;
import io.github.logger.controller.annotation.Logging;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static io.github.benas.randombeans.api.EnhancedRandom.random;

@RestController
@Logging
public class UserController {

    @GetMapping("/get-random-user")
    @ResponseBody
    public User getUser() {
        return random(User.class);
    }
}
