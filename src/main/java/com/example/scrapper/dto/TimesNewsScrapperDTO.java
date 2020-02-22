package com.example.scrapper.dto;

import com.example.scrapper.pojo.TopSixNews;

public class TimesNewsScrapperDTO {
    TopSixNews news[];

    public TopSixNews[] getNews() {
        return news;
    }

    public void setNews(TopSixNews[] news) {
        this.news = news;
    }
}

