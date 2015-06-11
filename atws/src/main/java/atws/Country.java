package atws;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {

	@Id
	@GeneratedValue
	@Column(name = "countryId")
	private Long id;
	private String name;

	@OneToMany(mappedBy = "country")
	private List<State> state;

	public Country() {
		
	}

	public Country(String name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<State> getState() {
		return state;
	}

	public void setState(List<State> state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return name;
	}

}
