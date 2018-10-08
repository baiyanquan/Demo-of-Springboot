package model;
import org.springframework.data.annotation.Id;

public class Greetings {

	@Id
    public long id;

	public String string_id;
	
    public String word;
    public Greetings(){
    	id=0;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return String.format(
                "Greetings[id=%d, word='%s']",
                id , word);
    }
 
}
