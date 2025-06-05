package com.easy_pick.service;

import com.easy_pick.exception.ReviewNotFoundException;
import com.easy_pick.model.Product;
import com.easy_pick.model.Review;
import com.easy_pick.model.User;
import com.easy_pick.request.CreateReviewRequest;

import javax.naming.AuthenticationException;
import java.util.List;

public interface ReviewService {

    Review createReview(CreateReviewRequest req,
                        User user,
                        Product product);

    List<Review> getReviewsByProductId(Long productId);

    Review updateReview(Long reviewId,
                        String reviewText,
                        double rating,
                        Long userId) throws ReviewNotFoundException, AuthenticationException;


    void deleteReview(Long reviewId, Long userId) throws ReviewNotFoundException, AuthenticationException;

}
