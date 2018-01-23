package dao;

import bean.Game;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class GameDAO extends DAO
{
    public List<Game> index() throws Exception
    {
        List<Game> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement stmt = con.prepareStatement(
            "select * from games");
        ResultSet rs = stmt.executeQuery();

        while(rs.next())
        {
            Game game = new Game(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getInt("price"),
                rs.getString("company")
            );

            list.add(game);
        }
        stmt.close();
        con.close();

        return list;
    }

    public Game select(int id) throws Exception
    {
        Connection con = getConnection();
        PreparedStatement stmt = con.prepareStatement(
            "select * from games where id=?"
            );
        stmt.setInt(1, id);
        ResultSet rs = stmt.executeQuery();

        rs.next();
        Game game = new Game(
            rs.getInt("id"),
            rs.getString("title"),
            rs.getInt("price"),
            rs.getString("company")
        );

        stmt.close();
        con.close();

        return game;
    }

    public int create(Game game) throws Exception
    {
        Connection con = getConnection();
        PreparedStatement stmt = con.prepareStatement(
        "insert into games values(null, ?, ?, ?)");

        stmt.setString(1, game.getTitle());
        stmt.setInt(2, game.getPrice());
        stmt.setString(3, game.getCompany());
        int line = stmt.executeUpdate();

        stmt.close();
        con.close();

        return line;
    }

    public int update(Game game) throws Exception
    {
        Connection con = getConnection();
        PreparedStatement stmt = con.prepareStatement(
        "update games set title=?, price=?, company=? where id=?");

        stmt.setString(1, game.getTitle());
        stmt.setInt(2, game.getPrice());
        stmt.setString(3, game.getCompany());
        stmt.setInt(4, game.getId());
        int line = stmt.executeUpdate();

        stmt.close();
        con.close();

        return line;
    }

    public int delete(int id) throws Exception
    {
        Connection con = getConnection();
        PreparedStatement stmt = con.prepareStatement(
        "DELETE FROM games WHERE ID=?");

        stmt.setInt(1, id);
        int line = stmt.executeUpdate();

        stmt.close();
        con.close();

        return line;
    }
}
