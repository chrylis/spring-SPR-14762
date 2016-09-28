package com.chrylis.spring.repro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chrylis.spring.repro.domain.Foo;

@RestController
@RequestMapping("/foos")
public class JsonController {
    
    @GetMapping("/{id}")
    public Foo foo(@PathVariable Foo id) {
       return id;
    }
}
