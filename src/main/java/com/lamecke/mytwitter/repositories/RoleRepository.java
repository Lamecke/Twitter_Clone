package com.lamecke.mytwitter.repositories;

import com.lamecke.mytwitter.entities.Role;
import com.lamecke.mytwitter.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

