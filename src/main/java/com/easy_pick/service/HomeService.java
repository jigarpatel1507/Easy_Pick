package com.easy_pick.service;

import com.easy_pick.model.Home;
import com.easy_pick.model.HomeCategory;

import java.util.List;

public interface HomeService {

    Home creatHomePageData(List<HomeCategory> categories);

}
