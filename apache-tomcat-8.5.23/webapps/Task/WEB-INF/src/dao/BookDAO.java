package dao;

import bean.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class BookDAO extends DAO
{
    public List<Book> index() throws Exception
    {
        List<Book> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement stmt = con.prepareStatement(
        "select * from books");
        ResultSet rs = stmt.executeQuery();

        while(rs.next())
        {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setTitle(rs.getString("title"));
            book.setAuthor(rs.getString("author"));
            book.setIsbn(rs.getInt("isbn"));
            list.add(book);
        }
        stmt.close();
        con.close();

        return list;
    }

    public Book select(int id) throws Exception
    {
        Connection con = getConnection();
        PreparedStatement stmt = con.prepareStatement(
            "select * from books where id=?"
            );
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        rs.next();
        Book book = new Book();
        book.setId(rs.getInt("id"));
        book.setTitle(rs.getString("title"));
        book.setAuthor(rs.getString("author"));
        book.setIsbn(rs.getInt("isbn"));

        stmt.close();
        con.close();

        return book;
    }

    public int create(Book book) throws Exception
    {
        Connection con = getConnection();
        PreparedStatement stmt = con.prepareStatement(
        "insert into books values(null, ?, ?, ?)");

        stmt.setString(1, book.getTitle());
        stmt.setString(2, book.getAuthor());
        stmt.setInt(3, book.getIsbn());
        int line = stmt.executeUpdate();

        stmt.close();
        con.close();

        return line;
    }

    public int update(Book book) throws Exception
    {
        Connection con = getConnection();
        PreparedStatement stmt = con.prepareStatement(
        "update books set title=?, author=?, isbn=? where id=?");

        stmt.setString(1, book.getTitle());
        stmt.setString(2, book.getAuthor());
        stmt.setInt(3, book.getIsbn());
        stmt.setInt(4, book.getId());
        int line = stmt.executeUpdate();

        stmt.close();
        con.close();

        return line;
    }

    public int delete(int id) throws Exception
    {
        Connection con = getConnection();
        PreparedStatement stmt = con.prepareStatement(
        "DELETE FROM books WHERE ID=?");

        stmt.setInt(1, id);
        int line = stmt.executeUpdate();

        stmt.close();
        con.close();

        return line;
    }
}
