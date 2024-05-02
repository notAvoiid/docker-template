package com.docker.template.model;

import jakarta.persistence.*;

@Entity
@Table

public class Docker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Docker(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Docker() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
