package org.skypro.skyshop.article;

import org.skypro.skyshop.search.Searchable;

public class Article implements Searchable {
    private String article;
    private String articleText;

    public Article(String article, String articleText) {
        this.article = article;
        this.articleText = articleText;
    }

    @Override
    public String toString() {
        return article + '\n' + articleText;
    }

    @Override
    public String getSearchTerm() {
        return this + " " + getTypeContent();
    }

    @Override
    public String getTypeContent() {
        return "ARTICLE";
    }

    @Override
    public String getStringRepresentation() {
        return article + "\n" + getTypeContent();
    }

    public String getArticle() {
        return article;
    }

    public String getArticleText() {
        return articleText;
    }
}
