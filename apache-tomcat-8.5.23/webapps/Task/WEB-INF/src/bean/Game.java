package bean;

public class Game implements java.io.Serializable
{
    private int id;
    private String title;
    private int price;
    private String company;

    public Game()
    {
        
    }

    public Game(int id, String title, int price, String company)
    {
        this.id = id;
        this.title = title;
        this.price = price;
        this.company = company;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public int getPrice()
    {
        return price;
    }

    public String getCompany()
    {
        return company;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public void setCompany(String company)
    {
        this.company = company;
    }
}
