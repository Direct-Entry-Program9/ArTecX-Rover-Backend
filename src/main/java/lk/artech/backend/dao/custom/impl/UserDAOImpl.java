package lk.artech.backend.dao.custom.impl;

import lk.artech.backend.dao.custom.UserDAO;
import lk.artech.backend.entity.SuperEntity;
import lk.artech.backend.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Component
public class UserDAOImpl implements UserDAO {

    private final JdbcTemplate jdbc;
    private final RowMapper<User> userRowMapper = (rs,rowNum)->
            new User(rs.getString("username"),rs.getInt("currentX"),rs.getInt("currentY"),rs.getString("previousCommand"));

    public UserDAOImpl(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }


    @Override
    public User save(User user) {
        jdbc.update("INSERT INTO User (username, currentX, currentY, previousCommand) VALUES (?,?,?,?)",
                user.getUsername(), user.getCurrentX(), user.getCurrentY(), user.getCommand());
        return user;
    }

    @Override
    public void update(User user) {
        jdbc.update("UPDATE User SET currentX=?, currentY=?, previousCommand=? WHERE username=?",
                user.getCurrentX(), user.getCurrentY(),user.getCommand(),user.getUsername());
    }

    @Override
    public void deleteById(String username) {
        jdbc.update("DELETE FROM User WHERE username=?", username);
    }

    @Override
    public Optional<User> findById(String username) {
        return jdbc.query("SELECT * FROM User WHERE username=?",userRowMapper , username).stream().findFirst();
    }

    @Override
    public List<User> findAll() {
        return jdbc.query("SELECT * FROM User", userRowMapper);
    }

    @Override
    public long count() {
        return jdbc.queryForObject("SELECT COUNT(username) FROM User", Long.class);
    }

    @Override
    public boolean existById(String username) {
        return findById(username).isPresent();
    }
}
