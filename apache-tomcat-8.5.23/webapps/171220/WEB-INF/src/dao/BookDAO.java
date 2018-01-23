package dao;

import bean.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class BookDAO extends DAO
{
    //private Book book;
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
}
