package learninghibernate.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class OrderDetails {

	@EmbeddedId
	private OrderDetailsId orderDetailsId;
	
	private String productName;
	
	private String NameOfPerson;
	
	public OrderDetails() {
		
	}

	public OrderDetails(OrderDetailsId orderDetailsId, String productName, String nameOfPerson) {
		
		this.orderDetailsId = orderDetailsId;
		this.productName = productName;
		NameOfPerson = nameOfPerson;
	}

	public OrderDetailsId getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(OrderDetailsId orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getNameOfPerson() {
		return NameOfPerson;
	}

	public void setNameOfPerson(String nameOfPerson) {
		NameOfPerson = nameOfPerson;
	}
	
	
	
	
}
