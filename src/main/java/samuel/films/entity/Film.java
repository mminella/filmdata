package samuel.films.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.persistence.oxm.annotations.XmlPath;

@Entity
@Table(name = "films")
@XmlRootElement(name = "FilmDetail")
@XmlAccessorType(XmlAccessType.FIELD)
public class Film {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@XmlPath(value = "Film/@Code")
	@Column(name = "film_code", nullable = false)
	public String filmCode;

	@XmlElement(name = "Film")
	@Column(name = "film_name", nullable = false)
	private String filmName;

	@XmlElement(name = "Imdb")
	@Column(name = "imdb", nullable = false)
	private String imdb;

	// @XmlPath(value = "FilmInformation/Director/text()")
	// private String directors;
	
	//@XmlPath(value = "FilmInformation/Directors/Director/text()")
	//@ManyToMany(cascade = CascadeType.ALL)
	//@JoinTable(name = "directors", joinColumns = { @JoinColumn(name = "film_id") }, inverseJoinColumns = { @JoinColumn(name = "director_id") })
	//private List<Director> directors = new ArrayList<Director>();

	public String getFilmCode() {
		return filmCode;
	}

	public String getFilmName() {
		return filmName;
	}

	public String getImdb() {
		return imdb;
	}

	// public String getDirectors() {
	// return directors;
	// }
	
	//public List<Director> getDirectors() {
	//	return directors;
	//}

	//public void setDirectors(List<Director> directors) {
	//	this.directors = directors;
	//}
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Film [filmCode=" + filmCode + ", filmName=" + filmName
				+ ", imdb=" + imdb + "]";
	}

}