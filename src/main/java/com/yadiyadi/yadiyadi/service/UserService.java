package com.yadiyadi.yadiyadi.service;

import com.yadiyadi.yadiyadi.dto.UserDto;
import com.yadiyadi.yadiyadi.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByUsername(String username);
    List<UserDto> findAllUsers();
}
