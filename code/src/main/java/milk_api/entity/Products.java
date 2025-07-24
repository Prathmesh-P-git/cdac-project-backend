package milk_api.entity;

import java.math.BigDecimal;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

@Entity
@Table(name = "products")
public class Products {

    @Id
    @Column(name = "prod_id", nullable = false, unique = true)
    private String prodId;

    @Column(name = "prod_name", nullable = false)
    private String prodName;

    @Column(name = "price", nullable = false, precision = 10, scale = 2)
    private BigDecimal price;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    public Products(String prodId, String prodName, BigDecimal price, int quantity) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
        this.quantity = quantity;
    }

    
    public Products() {
		
	}

    

	public String getProdId() {
		return prodId;
	}


	public void setProdId(String prodId) {
		this.prodId = prodId;
	}


	public String getProdName() {
		return prodName;
	}


	public void setProdName(String prodName) {
		this.prodName = prodName;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
    public String toString() {
        return "Products [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + ", quantity=" + quantity + "]";
    }
}
