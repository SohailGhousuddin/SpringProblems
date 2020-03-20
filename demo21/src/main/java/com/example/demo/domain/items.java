package com.example.demo.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
//@JsonIgnoreProperties(ignoreUnknown = true)
public class items {
	
	@Id
	private Double id;
	private String name;
	private String description;
	private String short_name;
	private String category_short_name;
	
	private String small_portion_name;
	private String large_portion_name;
	private Double price_small;
	private Double price_large;
	
	@Embedded
	private reviews reviews;
	
	public items(Double id, String name, String description, String short_name, String category_short_name,
			String small_portion_name, String large_portion_name, Double price_small, Double price_large,
			com.example.demo.domain.reviews reviews) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.short_name = short_name;
		this.category_short_name = category_short_name;
		this.small_portion_name = small_portion_name;
		this.large_portion_name = large_portion_name;
		this.price_small = price_small;
		this.price_large = price_large;
		this.reviews = reviews;
	}

	public reviews getReviews() {
		return reviews;
	}

	public void setReviews(reviews reviews) {
		this.reviews = reviews;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getShort_name() {
		return short_name;
	}

	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}

	public String getCategory_short_name() {
		return category_short_name;
	}

	public void setCategory_short_name(String category_short_name) {
		this.category_short_name = category_short_name;
	}

	public String getSmall_portion_name() {
		return small_portion_name;
	}

	public void setSmall_portion_name(String small_portion_name) {
		this.small_portion_name = small_portion_name;
	}

	public String getLarge_portion_name() {
		return large_portion_name;
	}

	public void setLarge_portion_name(String large_portion_name) {
		this.large_portion_name = large_portion_name;
	}

	public Double getPrice_small() {
		return price_small;
	}

	public void setPrice_small(Double price_small) {
		this.price_small = price_small;
	}

	public Double getPrice_large() {
		return price_large;
	}

	public void setPrice_large(Double price_large) {
		this.price_large = price_large;
	}

	/*@Embedded
	private reviews reviews;*/
	public items()
	{}
	
}
