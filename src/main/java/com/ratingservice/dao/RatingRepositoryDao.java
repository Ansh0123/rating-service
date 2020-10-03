package com.ratingservice.dao;

import com.ratingservice.model.Rating;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepositoryDao extends CrudRepository<Rating, Integer> {
}
