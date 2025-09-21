package com.demo.Online_Food_System.Entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
	@Table(name = "users")
	public class User {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private String username;
	    
	    private String password;
	    private String email;
	    private String address;
	    private String phoneNumber;
	    
	    // getter and setter methods
		public int getId() {
			return id;
		}
		public void setId(int id) {
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
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		// peramterized constructor
		public User(int id, String username, String password, String email, String address, String phoneNumber) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.email = email;
			this.address = address;
			this.phoneNumber = phoneNumber;
		}
		
		// default constructor
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		// to string methods
		@Override
		public String toString() {
			return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
					+ ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
		}
}