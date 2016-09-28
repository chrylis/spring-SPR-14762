package com.chrylis.spring.repro.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Foo {
    
    @Id
    @GeneratedValue
    private Long id;
    
    private String stuff;
    
    public Foo(String stuff) {
        this.stuff = stuff;
    }
}
