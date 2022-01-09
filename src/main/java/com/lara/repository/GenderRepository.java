package com.lara.repository;

import org.springframework.data.repository.CrudRepository;

import com.lara.entity.Gender;

public interface GenderRepository extends CrudRepository<Gender, Integer> {

}
