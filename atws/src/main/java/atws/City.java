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
public class City {

	@Id
	@GeneratedValue
	@Column(name = "cityId")
	private Long id;

	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String name;

	@ManyToOne
	@JoinColumn(name = "stateId")
	private State state;

	@OneToMany(mappedBy = "city")
	private List<User> user;

	public City(String name, State state) {
		super();
		this.name = name;
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
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

	@Override
	public String toString() {
		return name;
	}

}
