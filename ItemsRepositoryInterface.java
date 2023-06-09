package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Items;

@Repository
public interface ItemsRepositoryInterface extends CrudRepository <Items, Integer> {

}
