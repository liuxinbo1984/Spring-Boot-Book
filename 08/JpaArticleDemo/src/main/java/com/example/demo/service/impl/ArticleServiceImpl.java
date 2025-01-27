package com.example.demo.service.impl;


import com.example.demo.entity.Article;
import com.example.demo.repository.ArticleRepository;
import com.example.demo.service.ArticleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: 标注为服务类
 */
@AllArgsConstructor
@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    /**
     * Description: 重写service接口的实现，实现列表功能
     */
    @Override
    public List<Article> getArticleList() {
        return articleRepository.findAll();
    }

    /**
     * Description: 重写service接口的实现，实现根据id查询对象功能。
     */
    @Override
    public Article findArticleById(long id) {
        return articleRepository.findById(id);
    }


}

