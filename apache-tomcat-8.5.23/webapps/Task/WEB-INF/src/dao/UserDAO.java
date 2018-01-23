package dao;

import bean.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class UserDAO extends DAO
{
    public User sign_in(String name, String password)
        throws Exception
    {
        User user = null;
        Connection con = getConnection();

        PreparedStatement stmt;
        stmt = con.prepareStatement(
            "select * from users where name=? and password=?"
        );

        stmt.setString(1, name);
        stmt.setString(2, password);

        ResultSet rs = stmt.executeQuery();

        while(rs.next())
        {
            user = new User();
            user.setId(rs.getInt("id"));
            user.setName(rs.getString("name"));
            user.setPassword(rs.getString("password"));
        }

        stmt.close();
        con.close();
        return user;
    }

    public User find(String name)
        throws Exception
    {
        User user = null;
        Connection con = getConnection();

        PreparedStatement stmt;
        stmt = con.prepareStatement(
            "select * from users where name=?"
        );

        stmt.setString(1, name);

        ResultSet rs = stmt.executeQuery();

        while(rs.next())
        {
            user = new User(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("password"),
                rs.getString("address"),
                rs.getInt("telnumber")
                );
        }

        stmt.close();
        con.close();
        return user;
    }

    public int sign_up(User user)
        throws Exception
    {
        Connection con = getConnection();

        PreparedStatement stmt;
        stmt = con.prepareStatement(
            "insert into users values(null, ?, ?, ?, ?)"
        );

        stmt.setString(1, user.getName());
        stmt.setString(2, user.getPassword());
        stmt.setString(3, user.getAddress());
        stmt.setInt(4, user.getTelnumber());

        int line = stmt.executeUpdate();

        stmt.close();
        con.close();
        return line;
    }
}
