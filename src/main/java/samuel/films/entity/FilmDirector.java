package samuel.films.entity;

public class FilmDirector {

	private String filmCode;

	private Integer directorId;

	public String getFilmCode() {
		return filmCode;
	}

	public void setFilmCode(String filmCode) {
		this.filmCode = filmCode;
	}

	public Integer getDirectorId() {
		return directorId;
	}

	public void setDirectorId(Integer directorId) {
		this.directorId = directorId;
	}

	@Override
	public String toString() {
		return "Film Director [filmCode= " + filmCode + ", directorId= "
				+ directorId + "]";
	}

}