package samuel.films;

import org.springframework.batch.item.ItemProcessor;

import samuel.films.entity.Actor;
 
public class ActorProcessor implements ItemProcessor<Actor, Actor>{
 
    public Actor process(Actor result) throws Exception {
        System.out.println("Processing actor result: "+result);
 
        return result;
    }
 
}
