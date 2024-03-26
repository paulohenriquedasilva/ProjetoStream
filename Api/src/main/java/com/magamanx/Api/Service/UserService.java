package com.magamanx.Api.Service;

import com.magamanx.Api.Models.User;
import com.magamanx.Api.DTO.UserRegistrationDTO;
import com.magamanx.Api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public void register (UserRegistrationDTO data){
        userRepository.save(new User(data));

        //ainda será inserido o tratamento de erro
    }


}
