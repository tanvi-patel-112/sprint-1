package com.demo.Dao;

import java.util.List;

import com.demo.Online_Food_System.Entity.Restaurant;

public interface RestaurantDAO {
    Restaurant createRestaurant(Restaurant restaurant);
    Restaurant getRestaurant(String restaurantId);
    List<Restaurant> getAllRestaurants();
    Restaurant updateRestaurant(Restaurant restaurant);
    void deleteRestaurant(int restaurantId);
	Restaurant getRestaurant(int restaurantId);
}
