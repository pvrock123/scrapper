package com.example.amit.services.impl;
import com.example.amit.pojo.TopSixNews;
import com.example.amit.services.TimesNewsScrapperService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class TimesNewsScrapperServiceImpl implements TimesNewsScrapperService {
    private String link, linkTitle,base_url="http://time.com";
    private Map<String ,String > m;
    private TopSixNews topSixNews[];
    private TopSixNews t1;
    @Override
    public TopSixNews[] getTopSixNewsItems() throws IOException {
        Document doc = Jsoup.connect("https://time.com/").get();
        Elements ele=doc.select(".last-column").select(".column-tout-metadata a");
        int index=0;
        topSixNews= new TopSixNews[6];
        for(Element x:ele){
            t1=new TopSixNews();
            link=x.attr("href");
            linkTitle =x.text();

            t1.setTitle(linkTitle);
            t1.setLink(base_url+link);

            topSixNews[index]=t1;
            index++;
        }
        return topSixNews;
    }
}
