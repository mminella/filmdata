package samuel.films.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlPath;

@XmlRootElement(name = "FilmDetail")
@XmlAccessorType(XmlAccessType.FIELD)
public class Film {

	@XmlPath(value = "Film/@Code")
	public String filmCode;

	@XmlElement(name = "Film")
	private String filmName;

	@XmlElement(name = "Imdb")
	private String imdb;

	public String getFilmCode() {
		return filmCode;
	}

	public String getFilmName() {
		return filmName;
	}

	public String getImdb() {
		return imdb;
	}

	@Override
	public String toString() {
		return "Film [filmCode= " + filmCode + ", filmName= " + filmName
				+ ", imdb= " + imdb + "]";
	}

}