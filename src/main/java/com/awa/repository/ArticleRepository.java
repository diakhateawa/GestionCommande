package com.awa.repository;


import com.awa.domaine.Article;

public interface ArticleRepository {
    Article[] getAll();
    Article getById(int nolc);
}
