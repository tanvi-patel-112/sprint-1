package com.demo.Online_Food_System.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "restaurant_id")
    private int restaurantId;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "address", nullable = false, length = 200)
    private String address;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    // Many restaurants can belong to one user
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) // Foreign key
    private User user;

    
    // getter and setter methods
	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// peramerized constructor
	public Restaurant(int restaurantId, String name, String address, String phoneNumber, User userId) {
		super();
		this.restaurantId = restaurantId;
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.user = userId;
	}

	// default constructor
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// to string methods
	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", name=" + name + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", user=" + user + "]";
	}
    
}