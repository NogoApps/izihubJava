package model;

/**
 * Created by sg-0036936 on 03/01/2017.
 */
public class Article {

    private int idArticle;
    private String title;
    private String article;
    private int tag;
    private Object articleList[];
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Object[] getArticleList() {
        return articleList;
    }

    public void setArticleList(Object[] articleList) {
        this.articleList = articleList;
    }

    public int getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(int idArticle) {
        this.idArticle = idArticle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
}