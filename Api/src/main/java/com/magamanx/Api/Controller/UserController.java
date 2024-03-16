package com.magamanx.Api.Controller;

import com.magamanx.Api.Models.User;
import com.magamanx.Api.Models.UserRegistrationDTO;
import com.magamanx.Api.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    public void register (@RequestBody @Valid UserRegistrationDTO data){
        userService.register(data);
    }

}
