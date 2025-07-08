package com.mindshub.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "user")
@Table(name = "tb_user")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "name", length = 50, nullable = false, updatable = true)
    private String name;

    @Column(name = "email", length = 150, nullable = false, updatable = true, unique = true)
    private String email;

    @Column(name = "password", length = 25, nullable = false, updatable = true)
    private String password;
}
