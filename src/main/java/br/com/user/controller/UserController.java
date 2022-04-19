package br.com.user.controller;

import br.com.user.model.dto.UserDTO;
import br.com.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping
    public Page<UserDTO> list(Pageable pageable){
//        log.info("REST to get all Users");
        return this.service.getAll(pageable);
    }

    @PostMapping
    public void save(@RequestBody UserDTO user){
//        log.info("REST to get save entity: {}", user);
        this.service.save(user);
    }

    @GetMapping(value = "/{id}")
    public UserDTO getById(@PathVariable("id") Long id){
//        log.info("REST to get by id: {}", id);
        return this.service.findById(id);
    }
}
