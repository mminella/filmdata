package samuel.films;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import samuel.films.entity.Actor;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;
 
public class ActorPreparedStatementSetter implements ItemPreparedStatementSetter<Actor> {
 
    public void setValues(Actor result, PreparedStatement ps) throws SQLException {
        ps.setString(1, result.getActor());
    }
 
}
