package com.example.scrapper.services;

import com.example.scrapper.pojo.TopSixNews;

import java.io.IOException;

public interface TimesNewsScrapperService {
    TopSixNews[] getTopSixNewsItems() throws IOException;
}
