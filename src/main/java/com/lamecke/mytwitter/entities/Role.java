package com.lamecke.mytwitter.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private long roleId;
    private String name;

    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public enum Values {
        BASIC(1L),
        ADMIN(2L);
        long roleId;
        Values(long roleId){
            this.roleId =roleId;
        }

        public long getRoleId() {
            return roleId;
        }
    }
}
