package com.easy_pick.response;

import com.easy_pick.dto.OrderHistory;
import com.easy_pick.model.Cart;
import com.easy_pick.model.Product;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
