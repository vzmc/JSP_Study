package dao;

import bean.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class BookDAO extends DAO{
  public List<Book> index() throws Exception{
    List<Book> list=new ArrayList<>();

    Connection con=getConnection();
    PreparedStatement stmt = con.prepareStatement(
    "select * from books");
    ResultSet rs= stmt.executeQuery();

    while(rs.next()){
      Book b = new Book();
      b.setId(rs.getInt("id"));
      b.setTitle(rs.getString("Title"));
      b.setAuthor(rs.getString("Author"));
      b.setIsbn(rs.getInt("Isbn"));
      list.add(b);
    }
    stmt.close();
    con.close();

    return list;
  }

  public List<Book> show(int id) throws Exception{
    List<Book> list=new ArrayList<>();

    Connection con=getConnection();
    PreparedStatement stmt = con.prepareStatement(
    "select * from books where id=?");
    stmt.setInt(1, id);

    ResultSet rs= stmt.executeQuery();

    while(rs.next()){
      Book b = new Book();
      b.setId(rs.getInt("id"));
      b.setTitle(rs.getString("Title"));
      b.setAuthor(rs.getString("Author"));
      b.setIsbn(rs.getInt("Isbn"));
      list.add(b);
    }
    stmt.close();
    con.close();

    return list;
  }

  public List<Book> edit(int id) throws Exception{
    List<Book> list=new ArrayList<>();

    Connection con=getConnection();
    PreparedStatement stmt = con.prepareStatement(
    "select * from books where id=?");
    stmt.setInt(1, id);

    ResultSet rs= stmt.executeQuery();

    while(rs.next()){
      Book b = new Book();
      b.setId(rs.getInt("id"));
      b.setTitle(rs.getString("Title"));
      b.setAuthor(rs.getString("Author"));
      b.setIsbn(rs.getInt("Isbn"));
      list.add(b);
    }
    stmt.close();
    con.close();

    return list;
  }

  public int create(Book book) throws Exception{
    Connection con=getConnection();
    PreparedStatement stmt = con.prepareStatement(
    "insert into books values(null,?,?,?)");
    stmt.setString(1, book.getTitle());
    stmt.setString(2, book.getAuthor());
    stmt.setInt(3, book.getIsbn());
    int line=stmt.executeUpdate();

    stmt.close();
    con.close();
    return line;
  }

  public int update(Book book) throws Exception{
    Connection con=getConnection();
    PreparedStatement stmt=con.prepareStatement(
      "update books set title=?, author=?, isbn=? where id=?");
    stmt.setString(1, book.getTitle());
    stmt.setString(2, book.getAuthor());
    stmt.setInt(3, book.getIsbn());
    stmt.setInt(4, book.getId());
    int line=stmt.executeUpdate();

    stmt.close();
    con.close();
    return line;
  }
  public int delete(Book book) throws Exception{
    Connection con=getConnection();
    PreparedStatement stmt=con.prepareStatement(
      "delete from books where id=?");
    stmt.setInt(1, book.getId());
    int line=stmt.executeUpdate();
    return line;
  }
}
