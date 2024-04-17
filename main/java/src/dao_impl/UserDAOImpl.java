package java.src.dao_impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.src.dao_interfaces.UserDAO;
import java.src.model_classes.User;
import java.src.queries_enums.CRUDQueries.UserCRUDQueries;
import java.src.util.ConnectionFactory;

public class UserDAOImpl implements UserDAO {
    //Attributes
    private Connection connection = ConnectionFactory.getConnection();

    @Override
    public void insertUser(User user) {
        String sql = UserCRUDQueries.INSERT_USER.getQuery();

        try (
            PreparedStatement pstmt = connection.prepareStatement(sql))
        {
            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPasswordHash());
            pstmt.executeUpdate();

        }

        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void getUser(Long userId) {
        String sql = UserCRUDQueries.GET_USER.getQuery();
        try(PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setLong (1, userId);
            ResultSet resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                return extractUserFromResultSet;
            }

        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUser(Long userId) {

    }
}
