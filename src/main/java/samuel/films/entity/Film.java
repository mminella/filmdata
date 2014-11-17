package samuel.films.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "films")
@XmlRootElement(name = "FilmDetail")
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "film_code", nullable = false)
	private String code;

	@Column(name = "film_name", nullable = false)
	private String film;

	@Column(name = "imdb", nullable = false)
	private String imdb;

	@XmlElementWrapper(name = "Directors")
	@XmlElement(name = "Director")
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "film_directors", joinColumns = { @JoinColumn(name = "film_id") }, inverseJoinColumns = { @JoinColumn(name = "director_id") })
	private List<Director> directors = new ArrayList<Director>();

	@XmlElementWrapper(name = "Actors")
	@XmlElement(name = "Actor")
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "film_acors", joinColumns = { @JoinColumn(name = "film_id") }, inverseJoinColumns = { @JoinColumn(name = "actor_id") })
	private List<Actor> actors = new ArrayList<Actor>();

	@XmlAttribute(name = "Code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@XmlElement(name = "Imdb")
	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}

	@XmlElement(name = "Film")
	public String getFilm() {
		return film;
	}

	public void setFilm(String film) {
		this.film = film;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Director> getDirectors() {
		return directors;
	}

	public void setDirectors(List<Director> directors) {
		this.directors = directors;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

}