package learninghibernate.hibernate;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@EntityListeners(EntityListener.class)
@Entity
@Table(name="People")
public class Customer {

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
 int customerID;

@Column(name = "Customer_Names", length = 50, nullable = false, unique = false)
private String name;

@Transient
private String firstName;

private String lastName;

private String fullName;

private String residence;


String products;
 
@Transient
 private int quantity;
@Transient
private int costPerItem;

private int totalPrice;


@Temporal(TemporalType.DATE)
private Date currentDate;

@Enumerated(EnumType.STRING)
private Gender gender;
 



public Customer() {
	 
 }
 
public Customer( String customerName, String products,String first, String last) {
	
	this.name = customerName;
	this.products = products;
	this.firstName = first;
	this.lastName = last;
	

}





@Override
public String toString() {
	return "Customer [customerID=" + customerID + ", name=" + name + ", firstName=" + firstName + ", lastName="
			+ lastName + ", fullName=" + fullName + ", products=" + products + ", quantity=" + quantity
			+ ", costPerItem=" + costPerItem + ", totalPrice=" + totalPrice + ", currentDate=" + currentDate
			+ ", gender=" + gender + "]";
}

public int getCustomerID() {
	return customerID;
}

public void setCustomerID(int customerID) {
	this.customerID = customerID;
}

public String getCustomerName() {
	return name;
}

public void setCustomerName(String customerName) {
	this.name = customerName;
}

public String getProducts() {
	return products;
}

public void setProducts(String products) {
	this.products = products;
}



public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}
 
public String getFullName() {
	return fullName;
}

public void setFullName() {
	this.fullName = this.firstName + this.lastName;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public int getCostPerItem() {
	return costPerItem;
}

public void setCostPerItem(int costPerItem) {
	this.costPerItem = costPerItem;
}

public int getTotalPrice() {
	return totalPrice;
}

public void setTotalPrice() {
	this.totalPrice = this.quantity * this.costPerItem;
}

public Date getCurrentDate() {
	return currentDate;
}

public void setCurrentDate(Date currentDate) {
	this.currentDate = currentDate;
}


public Gender getGender() {
	return gender;
}

public void setGender(Gender gender) {
	this.gender = gender;
}

public String getResidence() {
	return residence;
}

public void setResidence(String residence) {
	this.residence = residence;
}






}
