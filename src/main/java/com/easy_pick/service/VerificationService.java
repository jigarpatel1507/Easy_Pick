package com.easy_pick.service;

import com.easy_pick.model.VerificationCode;

public interface VerificationService {

    VerificationCode createVerificationCode(String otp, String email);
}
