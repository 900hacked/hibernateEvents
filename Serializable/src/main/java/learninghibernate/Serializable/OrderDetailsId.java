package learninghibernate.Serializable;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class OrderDetailsId implements Serializable{
	
	
	private int orderId;
	
	private int productId;
	
	public OrderDetailsId() {
		
	}

	public OrderDetailsId(int orderId, int productId) {
		
		this.orderId = orderId;
		this.productId = productId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	

}
