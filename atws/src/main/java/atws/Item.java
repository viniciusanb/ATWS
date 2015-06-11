package atws;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Item {


	@Id
	@GeneratedValue
	private Long itemId;
	private String name;

	@ManyToOne
	@JoinColumn(name = "categoryId")
	private Category category;

	

	@OneToMany(mappedBy = "item")
	private List<UserItem> userItem;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Item(String name, Category category) {
		super();
		this.name = name;
		this.category = category;
	}



	public List<UserItem> getUserItem() {
		return userItem;
	}

	public void setUserItem(List<UserItem> userItem) {
		this.userItem = userItem;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return name;
	}

	

}
