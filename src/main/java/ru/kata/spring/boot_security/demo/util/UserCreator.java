package ru.kata.spring.boot_security.demo.util;

import ru.kata.spring.boot_security.demo.models.Role;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UserCreator {

        private static final String ROLE_ADMIN = "ROLE_ADMIN";
        private static final String ROLE_USER = "ROLE_USER";

        public static List<User> createUsersWithRoles() {
            User user = new User("user", "user", 26, "user@mail.ru", "user", Arrays.asList(ROLE_USER).stream().map(Role::new).collect(Collectors.toList()));
            User admin = new User("admin", "admin", 26, "admin@mail.ru", "admin", Arrays.asList(ROLE_ADMIN).stream().map(Role::new).collect(Collectors.toList()));
            return List.of(user, admin);
        }
    }

