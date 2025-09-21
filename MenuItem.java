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
@Table(name = "menu_item")
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private int itemId;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;
    
    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;
    
    // getter and setter methods

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
// peramterized constructor
	public MenuItem(int itemId, String name, double price, Restaurant restaurant) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.restaurant = restaurant;
	}

	// default constructor
	public MenuItem() {
		super();
		// TODO Auto-generated constructor stub
	}
// to string methods
	@Override
	public String toString() {
		return "MenuItem [itemId=" + itemId + ", name=" + name + ", price=" + price + ", restaurant=" + restaurant
				+ "]";
	}
    }   