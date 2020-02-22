package com.example.amit.dto;

import com.example.amit.pojo.TopSixNews;

public class TimesNewsScrapperDTO {
    TopSixNews news[];

    public TopSixNews[] getNews() {
        return news;
    }

    public void setNews(TopSixNews[] news) {
        this.news = news;
    }
}

