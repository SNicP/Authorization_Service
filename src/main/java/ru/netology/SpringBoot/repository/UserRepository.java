package ru.netology.SpringBoot.repository;

import org.springframework.stereotype.Repository;
import ru.netology.SpringBoot.authorities.Authorities;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

@Repository
public class UserRepository {

    public List<Authorities> getUserAuthorities(String user, String password) {
        if (user.equalsIgnoreCase("BadUser")) {
            return new ArrayList<>();
        } else {
            return new ArrayList<>(EnumSet.allOf(Authorities.class));
        }
    }
}
