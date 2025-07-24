package milk_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

@Entity
@Table(name = "confirmation")
public class Confirmation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;
    private double quantity;
    private boolean confirmed;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerProfile customer;

    @Override
    public String toString() {
        return "Confirmation [id=" + id + ", date=" + date + ", quantity=" + quantity + 
               ", confirmed=" + confirmed + ", customer=" + customer + "]";
    }

	public Confirmation() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}

	public CustomerProfile getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerProfile customer) {
		this.customer = customer;
	}

	public Confirmation(Long id, String date, double quantity, boolean confirmed, CustomerProfile customer) {
		super();
		this.id = id;
		this.date = date;
		this.quantity = quantity;
		this.confirmed = confirmed;
		this.customer = customer;
	}
   
	
    
}
