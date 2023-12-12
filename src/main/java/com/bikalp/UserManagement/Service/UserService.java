package com.bikalp.UserManagement.Service;

import com.bikalp.UserManagement.Entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User save(User user);
}
