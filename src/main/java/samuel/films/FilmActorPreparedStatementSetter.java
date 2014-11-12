package samuel.films;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import samuel.films.entity.FilmActor;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;
 
public class FilmActorPreparedStatementSetter implements ItemPreparedStatementSetter<FilmActor> {
 
    public void setValues(FilmActor result, PreparedStatement ps) throws SQLException {
        ps.setString(1, result.getFilmCode());
		ps.setLong(2, result.getActorId());
    }
 
}
