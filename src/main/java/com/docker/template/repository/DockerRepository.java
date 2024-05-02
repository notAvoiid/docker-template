package com.docker.template.repository;

import com.docker.template.model.Docker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DockerRepository extends JpaRepository<Docker, Long> {
}
