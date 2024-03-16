package com.magamanx.Api.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

import static java.time.LocalTime.now;


@Table(name = "Users")
@Entity(name = "Users")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "userId")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String password;
    private String email;
    private LocalTime datejoined;

    public User(UserRegistrationDTO data) {
        this.username = data.username();
        this.password = data.password();
        this.email = data.email();
        this.datejoined = now();
    }
}
