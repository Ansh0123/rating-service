package com.ratingservice.controller;

import com.ratingservice.model.Rating;
import com.ratingservice.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class RatingController {

    @Autowired
    RatingService ratingService;

    @GetMapping("rating/{id}")
    Rating getRating(@PathVariable(value = "id") Integer id){
        return ratingService.getRating(id);
    }

}
