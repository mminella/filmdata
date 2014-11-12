package samuel.films.entity;

public class FilmActor {

	private String filmCode;

	private Integer actorId;

	public String getFilmCode() {
		return filmCode;
	}

	public void setFilmCode(String filmCode) {
		this.filmCode = filmCode;
	}

	public Integer getActorId() {
		return actorId;
	}

	public void setActorId(Integer actorId) {
		this.actorId = actorId;
	}

	@Override
	public String toString() {
		return "Film Actor [filmCode= " + filmCode + ", actorId= " + actorId
				+ "]";
	}

}