package com.chrylis.spring.repro.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FooRepository extends JpaRepository<Foo, Long> {
}
