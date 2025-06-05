package com.easy_pick.service;

import com.easy_pick.model.Seller;
import com.easy_pick.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
