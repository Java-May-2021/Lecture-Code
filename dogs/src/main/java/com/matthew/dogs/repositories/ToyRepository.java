package com.matthew.dogs.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.matthew.dogs.models.Toy;

public interface ToyRepository extends CrudRepository<Toy, Long>{

}
