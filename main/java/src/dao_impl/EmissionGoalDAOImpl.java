package java.src.dao_impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.src.EmissionGoal;
import java.src.dao_interfaces.EmissionGoalDAO;
import java.src.queries_enums.CRUDQueries.EmissionGoalCRUDQueries;
import java.src.util.ConnectionFactory;

public class EmissionGoalDAOImpl implements EmissionGoalDAO {
    private Connection connection = ConnectionFactory.getConnection();

    @Override
    public void insertEmissionGoal(EmissionGoal emissionGoal) {

        String sql = EmissionGoalCRUDQueries.INSERT_GOAL.getQuery();
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setLong(1, emissionGoal.getUserId());
            pstmt.setDouble(2, emissionGoal.getTargetEmission());
            pstmt.setDate(3, java.sql.Date.valueOf(emissionGoal.getStartDate()));
            pstmt.setDate(4, java.sql.Date.valueOf(emissionGoal.getEndDate()));
            pstmt.setString(5, emissionGoal.getStatus());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public EmissionGoal getEmissionGoal(Long goalId) {
        return null;
    }

    @Override
    public void updateEmissionGoal(EmissionGoal emissionGoal) {

    }

    @Override
    public void deleteEmissionGoal(Long goalId) {

    }
}
