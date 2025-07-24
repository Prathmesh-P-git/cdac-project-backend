package milk_api.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

@Entity
@Table(name = "delivery_log")
public class DeliveryLog {

    @Id
    @Column(name = "delivery_id")
    private String deliveryId;

    @CreationTimestamp
    @Column(name = "delivery_date", updatable = false)
    private LocalDate date;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private Boolean confirm;

    @ManyToOne
    @JoinColumn(name = "cust_id", nullable = false)
    private CustomerProfile customer;

    @ManyToOne
    @JoinColumn(name = "prod_id", nullable = false)
    private Products products;

    @ManyToOne
    @JoinColumn(name = "admin_id", nullable = true)
    private AdminProfile createdBy;

    public DeliveryLog(String deliveryId, LocalDate date, int quantity, Boolean confirm,
                       CustomerProfile customer, Products products, AdminProfile createdBy) {
        this.deliveryId = deliveryId;
        this.date = date;
        this.quantity = quantity;
        this.confirm = confirm;
        this.customer = customer;
        this.products = products;
        this.createdBy = createdBy;
    }
    

    public DeliveryLog() {
		
	}


	public String getDeliveryId() {
		return deliveryId;
	}


	public void setDeliveryId(String deliveryId) {
		this.deliveryId = deliveryId;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public Boolean getConfirm() {
		return confirm;
	}


	public void setConfirm(Boolean confirm) {
		this.confirm = confirm;
	}


	public CustomerProfile getCustomer() {
		return customer;
	}


	public void setCustomer(CustomerProfile customer) {
		this.customer = customer;
	}


	public Products getProducts() {
		return products;
	}


	public void setProducts(Products products) {
		this.products = products;
	}


	public AdminProfile getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(AdminProfile createdBy) {
		this.createdBy = createdBy;
	}


	@Override
    public String toString() {
        return "DeliveryLog [deliveryId=" + deliveryId + ", date=" + date + ", quantity=" + quantity +
               ", confirm=" + confirm + ", customer=" + customer + ", products=" + products + 
               ", createdBy=" + createdBy + "]";
    }
}
