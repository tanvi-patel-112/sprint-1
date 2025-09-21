package com.demo.ServiceImpl;

import java.util.List;

import com.demo.DAOIMPL.RestaurantDaoImpl;
import com.demo.Dao.RestaurantDAO;
import com.demo.Online_Food_System.Entity.Restaurant;
import com.demo.Service.RestaurantService;

public class RestaurantServiceImple implements RestaurantService {

    RestaurantDAO restaurantDao = new RestaurantDaoImpl();

    @Override
    public Restaurant createRestaurant(Restaurant restaurant) {
        return restaurantDao.createRestaurant(restaurant);
    }

    @Override
    public Restaurant getRestaurant(int restaurantId) {
        return restaurantDao.getRestaurant(restaurantId);
    }

    @Override
    public Restaurant updateRestaurant(Restaurant restaurant) {
        return restaurantDao.updateRestaurant(restaurant);
    }

    @Override
    public void deleteRestaurant(int restaurantId) {
        restaurantDao.deleteRestaurant(restaurantId);
    }

	@Override
	public List<Restaurant> getAllRestaurants() {
		// TODO Auto-generated method stub
		return null;
	}
}