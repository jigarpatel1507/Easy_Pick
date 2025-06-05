package com.easy_pick.service;

import com.easy_pick.model.Order;
import com.easy_pick.model.Seller;
import com.easy_pick.model.Transaction;

import java.util.List;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}
