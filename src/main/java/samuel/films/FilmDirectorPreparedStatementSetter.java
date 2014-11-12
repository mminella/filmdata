package samuel.films;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import samuel.films.entity.FilmDirector;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;
 
public class FilmDirectorPreparedStatementSetter implements ItemPreparedStatementSetter<FilmDirector> {
 
    public void setValues(FilmDirector result, PreparedStatement ps) throws SQLException {
        ps.setString(1, result.getFilmCode());
		ps.setLong(2, result.getDirectorId());
    }
 
}
