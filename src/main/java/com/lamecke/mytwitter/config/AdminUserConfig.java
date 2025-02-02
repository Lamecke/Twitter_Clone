package com.lamecke.mytwitter.config;


import com.lamecke.mytwitter.entities.Role;
import com.lamecke.mytwitter.entities.User;
import com.lamecke.mytwitter.repositories.RoleRepository;
import com.lamecke.mytwitter.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Set;


@Configuration
public class AdminUserConfig implements CommandLineRunner {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder passwordEncoder;

    public AdminUserConfig(UserRepository userRepository, RoleRepository roleRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        var roleAdmin = roleRepository.findByName(Role.Values.ADMIN.name());
        var userAdmin =userRepository.findByUsername("admin");

        userAdmin.ifPresentOrElse(
                (user)-> {
                    System.out.println("admin ja existe");
                },
                ()-> {
                    var user = new User();
                    user.setUsername("admin");
                    user.setPassword(passwordEncoder.encode("123"));
                    user.setRoles(Set.of(roleAdmin));

                    userRepository.save(user);
                }
        );

    }
}
