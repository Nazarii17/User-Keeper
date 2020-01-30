package com.tkachuk.UserKeeper.service;

import com.tkachuk.UserKeeper.model.User;
import com.tkachuk.UserKeeper.repository.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository userRepository;

    public User findById(Long id) {
        return userRepository.getOne(id);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
