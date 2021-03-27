package com.awa.repository.ram;


import com.awa.domaine.Article;
import com.awa.domaine.Client;
import com.awa.repository.ArticleRepository;


public class ArrayBasedArticleRepository implements ArticleRepository {

    public static final Article[] ARTICLES = {
            new Article(1, "Lait", 2000, 2),
            new Article(2, "Sucre", 1000, 1),
            new Article(3, "Cafe", 800, 4),
            new Article(4, "Riz", 500, 7),
    };

    public Article[] getAll(){
        return ARTICLES;
    }

    public Article getById(int noart){
        Article article ;
        for (int i = 0; i < ARTICLES.length; i++) {
            if(noart == ARTICLES[i].getNoart()){
                return ARTICLES[i];
            }
        }
        return null;
    }
}
