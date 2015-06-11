package atws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemImage {

	@Id
	@GeneratedValue
	private Long itemImageId;
	private String imageUrl;

	@ManyToOne
	@JoinColumn(name = "userItemId")
	private UserItem userItem;

	public Long getItemImageId() {
		return itemImageId;
	}

	public void setItemImageId(Long itemImageId) {
		this.itemImageId = itemImageId;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public UserItem getUserItem() {
		return userItem;
	}

	public void setUserItem(UserItem userItem) {
		this.userItem = userItem;
	}

	

}
