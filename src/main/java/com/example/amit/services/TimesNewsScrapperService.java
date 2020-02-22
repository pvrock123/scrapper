package com.example.amit.services;

import com.example.amit.pojo.TopSixNews;

import java.io.IOException;

public interface TimesNewsScrapperService {
    TopSixNews[] getTopSixNewsItems() throws IOException;
}
