package milk_api.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name = "admin_profile")
public class AdminProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phone;
    private String email;
    private String address;

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonManagedReference
    private MilkUser user;

    // No-argument constructor
    public AdminProfile() {
    }

    
    public AdminProfile(Long id, String name, String phone, String email, String address, MilkUser user) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.user = user;
	}


	// Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MilkUser getUser() {
        return user;
    }

    public void setUser(MilkUser user) {
        this.user = user;
    }

    // toString method
    @Override
    public String toString() {
        return "AdminProfile{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", user=" + user +
                '}';
    }
}
