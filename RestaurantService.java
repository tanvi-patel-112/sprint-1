package com.demo.Service;

import java.util.List;

import com.demo.Online_Food_System.Entity.Restaurant;

public interface RestaurantService {
    Restaurant createRestaurant(Restaurant restaurant);
    Restaurant getRestaurant(int restaurantId);
    List<Restaurant> getAllRestaurants();
    Restaurant updateRestaurant(Restaurant restaurant);
    void deleteRestaurant(int restaurantId);
}
