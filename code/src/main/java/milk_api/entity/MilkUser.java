package milk_api.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

@Entity
@Table(name = "milk_user")
public class MilkUser {
	
	

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private CustomerProfile customer;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonBackReference
    private AdminProfile admin;

    public MilkUser(String username, String password, Role role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    
    

    public MilkUser() {
		
	}



	@Override
    public String toString() {
        return "MilkUser [id=" + id + ", username=" + username + ", role=" + role + "]";
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public CustomerProfile getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerProfile customer) {
		this.customer = customer;
	}

	public AdminProfile getAdmin() {
		return admin;
	}

	public void setAdmin(AdminProfile admin) {
		this.admin = admin;
	}
    
    
    
}
