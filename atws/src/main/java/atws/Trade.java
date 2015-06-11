package atws;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Trade {

	@Id
	@GeneratedValue
	private Long tradeId;
	private Date dateTime;
	private String place;
	private char isPermanent;
	@ManyToOne
	@JoinColumn(name = "UserId")
	private User user;
	@ManyToOne
	@JoinColumn(name = "UserId2")
	private User user2;
	@ManyToOne
	@JoinColumn(name = "ItemId")
	private Item item;
	@ManyToOne
	@JoinColumn(name = "ItemId2")
	private Item item2;
	
	public Long getTradeId() {
		return tradeId;
	}
	public void setTradeId(Long tradeId) {
		this.tradeId = tradeId;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public char getIsPermanent() {
		return isPermanent;
	}
	public void setIsPermanent(char isPermanent) {
		this.isPermanent = isPermanent;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public User getUser2() {
		return user2;
	}
	public void setUser2(User user2) {
		this.user2 = user2;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Item getItem2() {
		return item2;
	}
	public void setItem2(Item item2) {
		this.item2 = item2;
	}
	
	

}
