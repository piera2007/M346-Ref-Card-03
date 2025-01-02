package ch.bbw.architecturerefcard03.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="section")
public class Section {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;

	@OneToMany(mappedBy="section")
	private List<Joke> jokes;

	public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() { 
        return name; 
    }
    public void setName(String name) {
        this.name = name;
    }

}
