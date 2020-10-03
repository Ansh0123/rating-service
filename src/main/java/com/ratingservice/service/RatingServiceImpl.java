package com.ratingservice.service;

import com.ratingservice.dao.RatingRepositoryDao;
import com.ratingservice.model.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepositoryDao ratingRepositoryDao;

    @Override
    public Rating getRating(Integer id) {
        return ratingRepositoryDao.findById(id).orElse(null);
    }
}
