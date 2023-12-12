package com.bikalp.UserManagement.Service.Implementation;

import com.bikalp.UserManagement.Entity.User;
import com.bikalp.UserManagement.Repository.UserRepo;
import com.bikalp.UserManagement.Service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    private final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User save(User user) {
        return userRepo.save(user);
    }
}
