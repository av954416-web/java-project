package com.carrental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.carrental.model.Review;
import com.carrental.service.ReviewService;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public Review createReview(@RequestHeader("Authorization") String token, @RequestBody Review review) {
        return reviewService.createReview(token, review);
    }

    @PutMapping("/{id}/response")
    public Review respondReview(@RequestHeader("Authorization") String token,
                                @PathVariable Long id,
                                @RequestBody Review response) {
        return reviewService.respondReview(token, id, response.getOwnerResponse());
    }
}


