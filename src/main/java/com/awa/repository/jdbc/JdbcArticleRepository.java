package com.awa.repository.jdbc;

import com.awa.domaine.Article;
import com.awa.repository.ArticleRepository;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JdbcArticleRepository implements ArticleRepository {

    private final Db db;
    public JdbcArticleRepository(Db db) {
        this.db = db;
    }
    public Article[] getAll(){
        try {
            ResultSet rs = db.getResultSet("SELECT * FROM article");
            List<Article> articles = new ArrayList<>();
            while (rs.next()) {
                int noart = rs.getInt("noart");
                String libelle = rs.getString("libelle");
                int prix = rs.getInt("prix");
                int qte_stock = rs.getInt("qte_stocK");
                Article article = new Article(noart,libelle, prix, qte_stock);
            }
            return articles.toArray(new Article[0]);
        }
        catch (Exception ex){
            return new Article[0];
        }
    }
    public Article getById(int noart) {
        try {
            String query = "SELECT * FROM article where noart = ? ";

            ResultSet resultSet = db.getResultSet(query, noart);
            String libelle = resultSet.getString("libelle");
            int prix = resultSet.getInt("prix");
            int qte_stock = resultSet.getInt("qte_stock");
            return new Article(noart, libelle, prix, qte_stock);
        }
        catch (Exception ex){
            return null;
        }
    }
}
