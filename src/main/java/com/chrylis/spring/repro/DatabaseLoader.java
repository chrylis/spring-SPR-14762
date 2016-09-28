package com.chrylis.spring.repro;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.chrylis.spring.repro.domain.Foo;
import com.chrylis.spring.repro.domain.FooRepository;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Component
@Data
@RequiredArgsConstructor
public class DatabaseLoader implements CommandLineRunner {
    private final FooRepository foos;
    
    @Override
    @Transactional
    public void run(String... args) throws Exception {
        foos.save(Arrays.asList(new Foo("bar"), new Foo("baz")));
    }
}
