package fr.seblaporte.springsocial.controller;

import fr.seblaporte.springsocial.exception.ResourceNotFoundException;
import fr.seblaporte.springsocial.model.User;
import fr.seblaporte.springsocial.repository.UserRepository;
import fr.seblaporte.springsocial.security.CurrentUser;
import fr.seblaporte.springsocial.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
