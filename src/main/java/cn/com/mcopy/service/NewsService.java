package cn.com.mcopy.service;

import cn.com.mcopy.db.dao.mcopy.NewsMapper;
import cn.com.mcopy.db.model.mcopy.News;
import cn.com.mcopy.db.model.mcopy.NewsExample;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ucenter on 2016/12/21.
 */
@Component
public class NewsService {

    @Autowired
    private NewsMapper newsMapper;

    public List<News> list(){
        NewsExample example = new NewsExample();
        example.setOrderByClause("new_id desc");
        return newsMapper.selectByExampleWithBLOBs(example);
    }

    public News getNews(int newid){
        return newsMapper.selectByPrimaryKey(newid);
    }

    public void update(News news){
        newsMapper.updateByPrimaryKeySelective(news);
    }

    public void delete(int newid){
        newsMapper.deleteByPrimaryKey(newid);
    }

    public void add(News news){
        newsMapper.insert(news);
    }

    public void addRead(int newid,int readcount){
        News news = new News();
        news.setNEW_ID(newid);
        news.setREADCOUNT(readcount+1);
        newsMapper.updateByPrimaryKeySelective(news);
    }
}
