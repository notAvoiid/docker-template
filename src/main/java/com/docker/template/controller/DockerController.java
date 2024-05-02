package com.docker.template.controller;

import com.docker.template.model.Docker;
import com.docker.template.repository.DockerRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/docker")
public class DockerController {

    private final DockerRepository repository;

    public DockerController(DockerRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/save")
    public Docker save(@RequestBody Docker docker) {
        return repository.save(docker);
    }

}
