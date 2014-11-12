package samuel.films;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import samuel.films.entity.Director;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;
 
public class DirectorPreparedStatementSetter implements ItemPreparedStatementSetter<Director> {
 
    public void setValues(Director result, PreparedStatement ps) throws SQLException {
        ps.setString(1, result.getName());
    }
 
}
