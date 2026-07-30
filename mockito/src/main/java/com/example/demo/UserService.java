package com.example.demo;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String getWelcomeMessage(Long userId) {
        User user = userRepository.findById(userId);
        if (user == null) {
            return "User not found";
        }
        return "Welcome back, " + user.getName() + "!";
    }
}