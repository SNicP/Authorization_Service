package ru.netology.SpringBoot.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.SpringBoot.authorities.Authorities;
import ru.netology.SpringBoot.service.AuthorizationService;
import ru.netology.SpringBoot.user.User;

import java.util.List;

@RestController
public class AuthorizationController {
    private final AuthorizationService service;

    public AuthorizationController(AuthorizationService service) {
        this.service = service;
    }

    @GetMapping("/authorize")
    public List<Authorities> getAuthorities(@Valid User user) {
        return service.getAuthorities(user.getName(), user.getPassword());
    }
}
