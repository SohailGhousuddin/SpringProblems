package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.items;

public interface itemRepository extends CrudRepository<items,Long> {
	
	

}
