package samuel.films;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import samuel.films.entity.Film;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;
 
public class FilmPreparedStatementSetter implements ItemPreparedStatementSetter<Film> {
 
    public void setValues(Film result, PreparedStatement ps) throws SQLException {
        ps.setString(1, result.getFilmCode());
		ps.setString(2, result.getFilmName());
		ps.setString(3, result.getImdb());
		ps.setString(4, result.getDirectors());
    }
 
}
