package com.uep.wap.service;

import com.uep.wap.dto.BracketDTO;
import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.Bracket;
import com.uep.wap.model.User;
import com.uep.wap.repository.BracketRepository;
import com.uep.wap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(UserDTO userDTO) {
        User user = new User();
        user.setRole(userDTO.getRole());
        user.setEmail(userDTO.getEmail());
        user.setFirst_name(userDTO.getFirst_name());
        user.setLast_name(userDTO.getLast_name());
        user.setPassword(userDTO.getPassword());
        userRepository.save(user);
        System.out.println("Bracket added!");
        return user;
    }

}