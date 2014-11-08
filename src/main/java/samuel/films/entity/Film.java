package samuel.films.entity;
 
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "Result")
public class Film {
 
    private String filmCode;
    
    private String filmName;
 
    private String imdb;
    
    private String directors;
 
    private String actors;
    
    @XmlElement(name = "Film")
    public String getFilmCode() {
		return filmCode;
	}

	public void setFilmCode(String filmCode) {
		this.filmCode = filmCode;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	
	@XmlElement(name = "Imdb")
	public String getImdb() {
		return imdb;
	}

	public void setImdb(String imdb) {
		this.imdb = imdb;
	}
	
	@XmlElement(name = "Director")
	public String getDirectors() {
		return directors;
	}

	public void setDirectors(String directors) {
		this.directors = directors;
	}
	
	@XmlElement(name = "Actors")
	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	@Override
    public String toString() {
        return "Film [filmCode=" + filmCode + ", filmName=" + filmName
                + ", directors=" + directors + "]";
    }
 
}