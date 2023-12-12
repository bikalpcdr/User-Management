package com.bikalp.UserManagement.Controller;

import com.bikalp.UserManagement.Entity.User;
import com.bikalp.UserManagement.Service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/save")
    public ResponseEntity<User> save (@RequestBody User user){
        return ResponseEntity.ok().body(userService.save(user));
    }
}
