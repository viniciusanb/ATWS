package atws;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String user;
	private String password;
	private String email;
	private Date birthDate;
	private String telephoneNumber;
	private Double rating;
	private String imageURL;

	@ManyToOne
	@JoinColumn(name = "cityId")
	private City city;

	@OneToMany(mappedBy = "user")
	private List<UserItem> userItem;

	public User() {
		super();
	}

	public User(String name, String user, String password, String email,
			Date birthDate, String telephoneNumber, Double rating,
			String imageURL, City city) {
		super();
		this.name = name;
		this.user = user;
		this.password = password;
		this.email = email;
		this.birthDate = birthDate;
		this.telephoneNumber = telephoneNumber;
		this.rating = rating;
		this.imageURL = imageURL;
		this.city = city;
	}

	public List<UserItem> getUserItem() {
		return userItem;
	}

	public void setUserItem(List<UserItem> userItem) {
		this.userItem = userItem;
	}

	
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public String toString() {
		return name;
	}

}
