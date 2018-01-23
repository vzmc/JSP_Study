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
}
