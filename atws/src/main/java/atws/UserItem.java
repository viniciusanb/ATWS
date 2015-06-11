package atws;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class UserItem {

	@Id
	@GeneratedValue
	private Long userItemId;
	private String description;

	@ManyToOne
	@JoinColumn(name = "id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "itemId")
	private Item item;

	@OneToMany(mappedBy = "userItem")
	private List<ItemImage> itemImage;

	public List<ItemImage> getItemImage() {
		return itemImage;
	}

	public void setItemImage(List<ItemImage> itemImage) {
		this.itemImage = itemImage;
	}

	public Long getUserItemId() {
		return userItemId;
	}

	public UserItem() {
		super();
	}

	public void setUserItemId(Long userItemId) {
		this.userItemId = userItemId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
