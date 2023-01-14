package com.springsecurity.entity;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Account {
    @Id
    private Long id;
    private String email;

}
