package com.lex.petclinic.services;

import com.lex.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>  {
    Owner findByLastName(String lastName);
}
