package milk_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

@Entity
@Table(name = "milk_customer")
public class CustomerProfile {

    @Id
    @Column(name = "cust_id")
    private String cust_id;

    private String address;
    private String name;
    private String contact;
    private String email;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private MilkUser user;

    public CustomerProfile(String custId, String address, String name, String contact,
                           String email, MilkUser user) {
        this.cust_id = custId;
        this.address = address;
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.user = user;
    }

    @Override
    public String toString() {
        return "CustomerProfile [custId=" + cust_id + ", address=" + address + ", name=" + name +
               ", contact=" + contact + ", email=" + email + ", user=" + user + "]";
    }

	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public MilkUser getUser() {
		return user;
	}

	public void setUser(MilkUser user) {
		this.user = user;
	}

	public CustomerProfile() {
		
	}
    
    
}
