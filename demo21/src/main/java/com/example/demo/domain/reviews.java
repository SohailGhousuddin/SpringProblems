package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Embeddable
public class reviews {
	
	@Column(name="members_reviw")
    private String members_review;
    private String guests_review;
    private Double overall_ratings;
    
    public reviews(String members_review, String guests_review, Double overall_ratings) {
		super();
		this.members_review = members_review;
		this.guests_review = guests_review;
		this.overall_ratings = overall_ratings;
	}

	public String getMembers_review() {
		return members_review;
	}

	public void setMembers_review(String members_review) {
		this.members_review = members_review;
	}

	public String getGuests_review() {
		return guests_review;
	}

	public void setGuests_review(String guests_review) {
		this.guests_review = guests_review;
	}

	public Double getOverall_ratings() {
		return overall_ratings;
	}

	public void setOverall_ratings(Double overall_ratings) {
		this.overall_ratings = overall_ratings;
	}

	public reviews() {}
  
}
