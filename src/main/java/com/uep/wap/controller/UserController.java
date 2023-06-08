package com.uep.wap.controller;

import com.uep.wap.dto.PlayerDTO;
import com.uep.wap.dto.SupervisorDTO;
import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.Player;
import com.uep.wap.model.Supervisor;
import com.uep.wap.model.User;
import com.uep.wap.repository.MatchRepository;
import com.uep.wap.repository.UserRepository;
import com.uep.wap.service.PlayerService;
import com.uep.wap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Column;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity<User> createSupervisor(@RequestBody UserDTO userDTO) {
        User user = new User();
        user.setRole(userDTO.getRole());
        user.setEmail(userDTO.getEmail());
        user.setFirst_name(userDTO.getFirst_name());
        user.setLast_name(userDTO.getLast_name());
        user.setPassword(userDTO.getPassword());

        User savedUser = userRepository.save(user);

        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping("/{user_id}")
    public User getUser(@PathVariable Integer user_id) {
        return userService.getUser(user_id);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}