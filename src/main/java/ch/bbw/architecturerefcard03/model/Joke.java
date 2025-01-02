package ch.bbw.architecturerefcard03.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="joke")
public class Joke {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String text;
	private int rating;
	@Temporal(TemporalType.DATE)
	@Column(name="creation_date")
	private Date creationDate;

	@ManyToOne
	@JoinColumn(name="section_idfs", nullable=false)
	@JsonIgnore
	private Section section;

	public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	public Date getCreationDate() {
		return creationDate; }

	public void setCreationDate(Date d) {
		this.creationDate = d; }
	
		public Section getSection() {
			return section;
		}
		public void setSection(Section section) {
			this.section = section;
		}
		
}
