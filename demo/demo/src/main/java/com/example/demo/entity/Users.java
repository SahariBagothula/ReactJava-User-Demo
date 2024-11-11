package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    // @Column(nullable = false)
    private String firstname;

    // @Column(nullable = false)
    private String lastname;

    // @Column(nullable = false)
    private String email;

}
