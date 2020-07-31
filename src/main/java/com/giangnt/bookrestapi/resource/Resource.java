package com.giangnt.bookrestapi.resource;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

public interface Resource<T> {
    @GetMapping
    public ResponseEntity<Collection<T>> findAll();

    @GetMapping("{id}")
    public ResponseEntity<T> findById(@PathVariable Long id);

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<T> save(@RequestBody T t);

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<T> update(@RequestBody T t);

    @DeleteMapping("{id}")
    public ResponseEntity<T> delete(@PathVariable Long id);
}
