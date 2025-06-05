package com.easy_pick.service;

import com.easy_pick.exception.SellerException;
import com.easy_pick.exception.UserException;
import com.easy_pick.request.LoginRequest;
import com.easy_pick.request.SignupRequest;
import com.easy_pick.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
