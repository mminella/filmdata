package samuel.films;

import org.springframework.batch.item.ItemProcessor;

import samuel.films.entity.Film;
 
public class FilmProcessor implements ItemProcessor<Film, Film>{
 
    public Film process(Film result) throws Exception {
        System.out.println("Processing result :"+result);
 
        return result;
    }
 
}
