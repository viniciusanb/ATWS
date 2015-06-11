package atws;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class State {

	@Id
	@GeneratedValue
	@Column(name = "stateId")
	private Long id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "countryId")
	private Country country;

	@OneToMany(mappedBy = "state")
	private List<City> city;

	public State() {
		super();
	}

	public State(String name, Country country) {
		super();
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<City> getCity() {
		return city;
	}

	public void setCity(List<City> city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
