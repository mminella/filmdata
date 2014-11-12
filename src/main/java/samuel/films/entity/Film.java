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

	@XmlElement(name="Film")
    private String filmName;

	@XmlElement(name="Imdb")
    private String imdb;

	@XmlPath(value = "FilmInformation/Director/text()")
    private String directors;
 
    private String actors;
    
    public String getFilmCode() {
		return filmCode;
	}

	public String getFilmName() {
		return filmName;
	}

//	public void setFilmName(String filmName) {
//		this.filmName = filmName;
//	}
//
	public String getImdb() {
		return imdb;
	}

//	public void setImdb(String imdb) {
//		this.imdb = imdb;
//	}
//
	public String getDirectors() {
		return directors;
	}

//	public void setDirectors(String directors) {
//		this.directors = directors;
//	}
//
//	@XmlElement(name = "Actors")
//	public String getActors() {
//		return actors;
//	}
//
//	public void setActors(String actors) {
//		this.actors = actors;
//	}

	@Override
    public String toString() {
        return "Film [filmCode=" + filmCode + ", filmName=" + filmName
                + ", directors=" + directors + ", imdb=" + imdb + "]";
    }
 
}