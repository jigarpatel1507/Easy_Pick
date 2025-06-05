package com.easy_pick.ai.services;

import com.easy_pick.exception.ProductException;
import com.easy_pick.response.ApiResponse;

public interface AiChatBotService {

    ApiResponse aiChatBot(String prompt,Long productId,Long userId) throws ProductException;
}
