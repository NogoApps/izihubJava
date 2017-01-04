package DAO;

import factory.ConnectionFactory;
import model.Article;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sg-0036936 on 04/01/2017.
 */
public class DAOArticle {

    private Connection connection;

    //prepared statement to insertion
    PreparedStatement statement = null;

    public DAOArticle() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void addArticle(Article article) {
        String sql = "insert into izihub" +
                "(id, title, article, author, tag)" + "values (?, ?, ?, ?, ?)";
        try {
            connection.setAutoCommit(false);
            connection.prepareStatement(sql);
            //set the values
            statement.setInt(1, article.getIdArticle());
            statement.setString(2, article.getTitle());
            statement.setString(3, article.getArticle());
            statement.setString(4, article.getAuthor());
            statement.setInt(5, article.getTag());

            //execute
            statement.execute();
            connection.commit();

        } catch (SQLException e) {
            throw new RuntimeException(e);
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        }

    }

    public void removeArticle(Article article) {
        try {
            PreparedStatement statement = connection.prepareStatement("delete from izihub where id=?");
            statement.setLong(1, article.getIdArticle());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Article> getArticleList() {
        try {
            List<Article> articles = new ArrayList<Article>();
            PreparedStatement statement = this.connection.prepareStatement("select * from contato");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {

                //Creating the object

                Article article = new Article();
                article.setIdArticle(resultSet.getInt("id"));
                article.setTitle(resultSet.getString("title"));
                article.setArticle(resultSet.getString("article"));
                article.setAuthor(resultSet.getString("author"));
                article.setTag(resultSet.getInt("tag"));

                //Adding the object to the list

                articles.add(article);
            }

            resultSet.close();
            statement.close();
            return articles;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
