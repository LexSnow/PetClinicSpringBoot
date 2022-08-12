package com.lex.petclinic.services;

import com.lex.petclinic.model.Pet;

import java.util.Set;

public interface PerService {
    Pet findById(long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
