package com.example.projectt3.Controller;

import com.example.projectt3.Api.ApiResponse;
import com.example.projectt3.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    Logger logger = LoggerFactory.getLogger(UserController.class);


    @PostMapping("/login/{username}/{password}")
    public ResponseEntity login(@PathVariable String username, @PathVariable String password){
        logger.info("sign in");
        userService.login(username, password);
        return ResponseEntity.ok().body(new ApiResponse("Login"));
    }


}
