package bean;

public class Book implements java.io.Serializable{
  private int id;
  private String title;
  private String author;
  private int isbn;

  public int getId(){return id;}
  public String getTitle(){return title;}
  public String getAuthor(){return author;}
  public int getIsbn(){return isbn;}

  public void setId(int id){this.id = id;}
  public void setTitle(String title){this.title = title;}
  public void setAuthor(String author){this.author = author;}
  public void setIsbn(int isbn){this.isbn = isbn;}
}
