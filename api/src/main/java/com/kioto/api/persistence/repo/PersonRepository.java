package com.kioto.api.persistence.repo;

import com.kioto.api.persistence.model.Persons;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface  PersonRepository extends CrudRepository<Persons, Long> {
        List<Persons> findByLastName(String LastName);
}