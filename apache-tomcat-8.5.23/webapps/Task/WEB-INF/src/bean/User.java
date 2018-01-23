package bean;

public class User implements java.io.Serializable
{
    private int id;
    private String name;
    private String password;
    private String address;
    private int telnumber;

    public User()
    {

    }

    public User(int id, String name, String password, String address, int telnumber)
    {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
        this.telnumber = telnumber;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }

    public String getAddress()
    {
        return address;
    }

    public int getTelnumber()
    {
        return telnumber;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setTelnumber(int telnumber)
    {
        this.telnumber = telnumber;
    }
}
