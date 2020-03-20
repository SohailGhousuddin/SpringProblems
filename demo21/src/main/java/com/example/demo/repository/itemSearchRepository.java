package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import com.example.demo.domain.items;

public interface itemSearchRepository extends Repository<items, Long> {
	
	@Query("SELECT item FROM items item WHERE " +
            "LOWER(item.category_short_name) LIKE LOWER(CONCAT('%',:category_short_name, '%'))")
    List<items> findByCategory(@Param("category_short_name") String category_short_name);
    
    @Query("SELECT item FROM items item WHERE " +
            "LOWER(item.short_name) LIKE LOWER(CONCAT('%',:short_name, '%'))")
    List<items> findByShortName(@Param("short_name") String short_name);

}
