package com.vpquoi.demo.springsecurity.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "user")
@Data
public class User {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    private String username;

    private String password;

    private String email;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;
}
