import javax.persistence.Entity;
import javax.persistence.Id;
//
//
/*
 * Customer entity
 * @
 * 
 * 
 */
@Entity
public class Customer {
	//@Id annotation is used to specify the column as primary key column
	//and the @Id annotation can applicable for  all priany Java primitive type;any primitive wrapper type; String; java.util.Date;
	//java.sql.Date; java.math.BigDecimal; java.math.BigInteger. 
	@Id
	private int custId;
	private String customerName;
	private long customerPhone;
	private String customerEmail;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	
	

}
