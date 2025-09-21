package com.demo.Online_Food_System.Entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    // Many orders can belong to one user
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Many orders can belong to one restaurant
    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;

    @Column(name = "total_amount", nullable = false)
    private double totalAmount;

    // getter and setter methods
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	// peramerized constructor
	public Order(int orderId, User user, Restaurant restaurant, LocalDateTime orderDate, double totalAmount) {
		super();
		this.orderId = orderId;
		this.user = user;
		this.restaurant = restaurant;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
	}

	// default constructor
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
// to string methods
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", user=" + user + ", restaurant=" + restaurant + ", orderDate="
				+ orderDate + ", totalAmount=" + totalAmount + "]";
	}
    
}